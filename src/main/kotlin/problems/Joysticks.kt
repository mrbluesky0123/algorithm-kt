package problems


fun solution(name: String): Int {
    val chars = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
        'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')

    var nameChars = name.toCharArray()
    var cnt = 0
    var currentIndex = 0
    var initChar = 'A'
    for(curChar in nameChars) {
        var back = ((initChar - curChar).toInt() + 26) % 26
        var front =  ((curChar - initChar).toInt() + 26) % 26
        cnt += Math.min(back, front)
    }

    return cnt + (nameChars.size-1)

}


fun main(args: Array<String>) {
    var name = "JAZ"
    println(solution(name))
}
