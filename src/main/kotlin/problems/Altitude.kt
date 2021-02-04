package problems

/** Backjoon 2842 */

import java.util.*

var geographic: Array<String>? = null
var piro: Array<Array<String>>? = null
//var answer = ArrayList<Int>()
var inputRows: Int = 0
var moveDirs = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))

fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    inputRows = nextInt()
    geographic = Array(rows){next()}
    for(i in 0 until inputRows) {
        var eachPiro = next()
        var piros = eachPiro.split(" ")
        var pirosArray = piros.toTypedArray()

    }
    piro =

}