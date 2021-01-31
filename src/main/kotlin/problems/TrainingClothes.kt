package problems

fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    var answer = 0

    var reserveArrayList: ArrayList<Int> = ArrayList()
    var lostArrayList: ArrayList<Int> = ArrayList()

    for(stdnt in reserve) {
        if(!lost.contains(stdnt))
            reserveArrayList.add(stdnt)
    }

    for(stdnt in lost) {
        if(!reserve.contains(stdnt))
            lostArrayList.add(stdnt)
    }

    var lostStudents = lostArrayList.size
    var students: Int = n - lostArrayList.size

    for(reservedStudent in reserveArrayList) {
        val canBorrowStudents = arrayOf(reservedStudent - 1, reservedStudent + 1)
        for(stdnt in canBorrowStudents) {
            if(lostArrayList.contains(stdnt)){
                students++
                lostStudents--
                lostArrayList.remove(stdnt)
                break
            }
        }

        if(lostStudents == 0){
             break
        }
    }
    answer = students
    return answer
}

fun main(args: Array<String>) {

    var n = 5
//    var lost = intArrayOf()
    var lost = arrayOf(2,4).toIntArray()
    var reserved = arrayOf(2, 4).toIntArray()
    println(solution(n, lost, reserved))

}