package book.arrayandstring

import kotlin.math.min

fun main(args: Array<String>) {
    var a: String = "abcdef"
    var b: String = "azced"
    print("Edit distance between string \"${a}\" and \"${b}\": ")
    print(editDistance(a, b))
}

fun editDistance(arg1: String, arg2: String): Int {

    var matrix = Array(arg1.length + 1) { IntArray(arg2.length + 1) { 0 } }

    for(i in 0..arg1.length) {
        matrix[i][0] = i
    }

    for(i in 0..arg2.length) {
        matrix[0][i] = i
    }

    for(i in 1..arg1.length) {
        for(j in 1..arg2.length) {
            if(arg1[i-1] == arg2[j-1]) {
                matrix[i][j] = matrix[i-1][j-1]
            } else {
                matrix[i][j] = minimum(matrix[i-1][j], matrix[i][j-1], matrix[i-1][j-1]) + 1
            }
        }
    }

    /*for(i in 0 .. arg1.length) {
        for(j in 0 .. arg2.length) {
            print("${matrix[i][j]} ")
        }
        println()
    }*/

    return matrix[arg1.length][arg2.length]
}

fun minimum(a: Int, b: Int, c: Int): Int {
    return min(min(a, b), c)
}