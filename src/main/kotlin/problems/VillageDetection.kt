package problems

/** Backjoon 2667 */

import java.util.*

var apartments: Array<String>? = null
var visited: Array<Array<Boolean>>? = null
var answer = ArrayList<Int>()
var rows: Int = 0
var directions = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    rows = nextInt()
    apartments = Array<String>(rows){next()}
    visited = Array(rows){Array<Boolean>(rows){_ -> false} }
//    apartments.iterator().forEach { print("$it")}

    for(y in 0 until rows) {
        for(x in 0 until rows) {
            if((apartments!!)[y][x] == '1' && !(visited!!)[y][x]) {
                var apartCount = traverse(y, x)
                if(apartCount != 0) {
                    answer.add(apartCount)
                }
            }
        }
    }

    var sortedAnswer = answer.toArray()
    Arrays.sort(sortedAnswer)
    println(sortedAnswer.size)
    sortedAnswer.iterator().forEach { println("$it ") }

}

fun traverse(y: Int, x: Int): Int {
    (visited!!)[y][x] = true
    var hasNext = false
    var cnt = 1
    for(dir in directions) {
        val nextY = y + dir[0]
        val nextX = x + dir[1]
        if( nextX < 0 || nextY < 0 || nextX >= rows || nextY >= rows) {
            continue
        } else {
            if((apartments!!)[nextY][nextX] == '1' && !(visited!!)[nextY][nextX]) {
                hasNext = true
                cnt += traverse(nextY, nextX)
            }
        }
    }
    return cnt
}
