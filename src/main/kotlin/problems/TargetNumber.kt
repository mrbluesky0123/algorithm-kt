package problems


fun solution(numbers: IntArray, target: Int): Int {
    var answer = 0
    answer = calculate(numbers, target, 0, 0)
    return answer
}

fun calculate(numbers: IntArray, target: Int, currentIdx: Int, sum: Int): Int{

    var signs = intArrayOf(-1, 1)
    var cnt = 0
    var s = sum
    for(sign in signs) {
        s = sum + numbers[currentIdx] * sign
        if(currentIdx == numbers.size-1) {
            if(s == target)
                cnt += 1;
            else
                cnt = 0
        } else {
            cnt += calculate(numbers, target, currentIdx+1, s)
        }
    }

    return cnt

}


fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 1, 1, 1, 1), 5))
}