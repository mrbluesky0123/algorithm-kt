package problems

class Solution {
    var cnt: Int = 0
    var forDebug = Array<Int>(5){i -> 0}
    fun solution(numbers: IntArray, target: Int): Int {
//        var answer = 0
        calculate(numbers, target, 0, 0)
        return cnt
    }

    fun calculate(numbers: IntArray, target: Int, currentIdx: Int, sum: Int) {
        var signs = intArrayOf(-1, 1)
        for(sign in signs) {
            var s = sum + numbers[currentIdx] * sign
//            forDebug[currentIdx] = numbers[currentIdx] * sign
            if(currentIdx == numbers.size-1) {
//                forDebug.iterator().forEach { print("$it ") }
//                println()
                if(s == target)
                    cnt++;
            } else {
                calculate(numbers, target, currentIdx+1, s)
            }
        }
    }
}