fun main() {

   println(functions())
    }

fun functions() : String {
    val name = object{}.javaClass.enclosingMethod.name
    return name
}

