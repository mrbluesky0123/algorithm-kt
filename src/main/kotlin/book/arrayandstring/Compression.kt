package book.arrayandstring

fun main(args: Array<String>) {
    val input = "aaaabbcccddd"
    var output = ""
    val iterator = input.iterator()
    var currentCnt = 1
    var currentChar = iterator.next()
    var sb: StringBuffer = StringBuffer()
    while(iterator.hasNext()) {
        val next = iterator.next()
        println(next)
        println("Current = $currentChar")
        if(currentChar != next) {
            // output = output.plus("$currentChar$currentCnt") -> 계속해서 output 스트링을 만들어 내기 때문에 O(n^2)
            sb.append("$currentChar$currentCnt")
            currentChar = next
            currentCnt = 1
        } else {
            currentCnt++
        }
    }
//    output = output.plus("$currentChar$currentCnt")
    sb.append("$currentChar$currentCnt")
    println(sb.toString())
}