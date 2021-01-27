package book.stackandqueue

fun main(args: Array<String>) {
    var myQueue: MyQueue<String> = MyQueue()
    myQueue.enqueue("A")
    myQueue.enqueue("B")
    myQueue.enqueue("C")
    myQueue.enqueue("D")

    println(myQueue.dequeue())
    println(myQueue.dequeue())
    println(myQueue.dequeue())
    println(myQueue.dequeue())

}