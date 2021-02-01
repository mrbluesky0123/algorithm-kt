package problems

fun solution(brown: Int, yellow: Int): IntArray {
    var answer = intArrayOf()

    val total = brown + yellow
    val candidates = ArrayList<IntArray>()
    for(col in 1 until total) {
        for(row in 1 until total) {
            if(row > col) break
            if(row * col == total) {
//                candidates.add(intArrayOf(col, row))
                var brownTotal = 0
                val yellowTotal = 0
                for(i in 0 until col / 2) {
                    brownTotal += (col - 2*i) * 2 + (row - 2*(i+1)) * 2
                    if(brownTotal == brown && total - brownTotal == yellow){
                        answer = intArrayOf(col, row)
                        return answer
                    }
                }
            }
        }
    }
//    var flag = false
//    for(candidate in candidates) {
//        val col = candidate[0]
//        val row = candidate[1]
//        var brownTotal = 0
//        val yellowTotal = 0
//        for(i in 0 until candidate[0] / 2) {
//            brownTotal += (col - 2*i) * 2 + (row - 2*(i+1)) * 2
//            if(brownTotal == brown && total - brownTotal == yellow){
//                answer = candidate
//                break
//            }
//        }
//    }


    return answer
}


fun main(args:Array<String>) {
    solution(10, 2).iterator().forEach { print("$it, ")}
    println()
}