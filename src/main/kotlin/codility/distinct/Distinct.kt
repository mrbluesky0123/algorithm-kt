package codility.distinct

class Distinct {
    fun solution(A: IntArray): Int {
        var answer: Int = 0
        var map: MutableMap<Int, Int> = HashMap()
        for(elmnt in A) {
            if(map[elmnt] == null) {
                map[elmnt] = 1
            } else {
                continue
            }
        }
        answer = map.size
        return answer
    }
}