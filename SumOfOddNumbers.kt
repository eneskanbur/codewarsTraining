class SumOfOddNumbers {

    fun rowSumOddNumbers(n: Int): Int {
        if(n == 1) return 1

        return Math.pow(n.toDouble(), 3.0).toInt()
    }

}