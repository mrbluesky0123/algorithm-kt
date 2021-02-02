package problems


fun solution(name: String): Int {
    var nameChars = name.toCharArray()
    var moveCnt = 0
    var prevIndex = 0
    var initChar = 'A'

    for(curIndex in nameChars.indices) {
        val curChar = nameChars[curIndex]
        if(curChar == 'A') {
            continue
        }
        // get digit movement
        var left = ((prevIndex - curIndex) + nameChars.size) % nameChars.size
        var right = ((curIndex - prevIndex) + nameChars.size) % nameChars.size
        moveCnt += Math.min(left, right)

        // get movement for changing chars
        var down = ((initChar - curChar).toInt() + 26) % 26
        var up =  ((curChar - initChar).toInt() + 26) % 26
        moveCnt += Math.min(down, up)

        prevIndex = curIndex
    }

    return moveCnt
}


fun main(args: Array<String>) {
    var name = "BBBBAAAB"
    println(solution(name))
}
