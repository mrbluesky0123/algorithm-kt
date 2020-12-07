package book.arrayandstring

fun main(args: Array<String>) {
    var first  = "tomato"
    var second = "otamot"
    var iterator = first.iterator()
    var output = ""
    for(i in first.length-1 downTo 0) {
        print(first[i])
        output = output.plus(first[i])
    }
    println("## first: $first")
    println("## output: $output")

    println(second == output)

}