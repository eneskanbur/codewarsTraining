package kyu6

class FindTheParityOutlier {

    fun find(integers: Array<Int>): Int {

        if (integers.isEmpty()) {
            return 0
        }

        val evens = integers.filter { it % 2 == 0 }
        val odds = integers.filter { it % 2 == 1 || it % 2 == -1}

        return if (evens.size == 1){
            evens[0]
        }else if(odds.size == 1){
            odds[0]
        }else{
            return 0
        }
    }

}