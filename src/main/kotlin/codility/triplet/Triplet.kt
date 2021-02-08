package codility.triplet

import kotlin.math.max

class Triplet {
    fun solution(A: IntArray): Int {
        var answer: Int = 0
        var max = -9999
        for(i in A.indices) {

        }
        return answer
    }
}

class Elements(val index: Int, val value: Int): Comparable<Elements> {
    override fun compareTo(other: Elements): Int {
        return if(this.value > other.value) {
            1
        } else if(this.value == other.value) {
            0
        } else {
            1
        }
    }

}
