package problems

import java.util.*

var apartments: Array<String>? = null
var visited: Array<Array<Boolean>>? = null
var answer = intArrayOf()
var directions = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var rows: Int = nextInt()
    apartments = Array<String>(rows){next()}
    visited = Array(rows){Array<Boolean>(rows){_ -> false} }
//    apartments.iterator().forEach { print("$it")}

}

fun traverse(x: Int, y: Int): Int {
    (visited!!)[x][y] = true
    var cnt = 1
    for(dir in directions) {
        val nextX = x + dir[0]
        val nextY = y + dir[1]
        if( nextX < 0 || nextY < 0) {
            continue
        } else {
            if((apartments!!)[nextX][nextY] == '1' && !(visited!!)[nextX][nextY]) {
               cnt += traverse(nextX, nextY)
            }
        }
    }
}
