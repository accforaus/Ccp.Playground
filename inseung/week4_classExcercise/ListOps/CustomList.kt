class CustomList <T> (val value: List<T>) {
    fun <U> foldL(acc: U, input: List<T>, func: (U, T) -> U) : U =
        if (input.isEmpty()) acc else foldL(func(acc, input.first()), input.drop(1), func) // T of func is type of current element in folding procedure of given List

    fun <U> foldR(acc: U, input: List<T>, func: (U, T) -> U) : U =
        if (input.isEmpty()) acc else foldR(func(acc, input.last()), input.dropLast(1), func)

    fun append(given: CustomList<T>) = CustomList(foldL(value, given.value, {acc, element -> acc + element})) // Change type of foldL's return into CustomList

    fun concatenate (vararg given: CustomList<T>) : CustomList<T> {
        var result = CustomList(emptyList<T>())
        for (i in given) result.append(i)
        return result
    }

    fun filter(judge: (T) -> Boolean) = CustomList(foldL(emptyList<T>(), value, {acc, element-> if (judge(element)) acc + element else acc}))

    fun map(action: (T) -> T)  = CustomList(foldL(emptyList<T>(), value, {acc, element -> acc + action(element)}))

    fun length() : Int = foldL (0, value, {count, _ -> count + 1}) // use accumulator as counter

    fun reverse() = CustomList(foldR(emptyList<T>(), value, {acc, element -> acc + element})) //foldR visits given List's element in backward
}