class Triangle (val num: Int) {
    fun getRows() : ArrayList<ArrayList<Int>> {
        val result = arrayListOf(arrayListOf(1))
        for (i in 1..(num - 1)) {
            val temp = arrayListOf(1)
            for (j in 1..(result.last().size - 1))
                temp.add(result.last()[j] + result.last()[j - 1]) // (n k) = (n -1, k - 1) + (n - 1, k)
            temp.add(1)
            result.add(temp)
        }
        return result
    }
    fun getLastRow () = getRows().last()
}