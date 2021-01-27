package book.stackandqueue

import java.util.*

class MyQueue<T> {

    var stack1: Stack<T> = Stack()
    var stack2: Stack<T> = Stack()

    fun enqueue(item: T): Unit {
        this.stack1.push(item)
    }

    fun dequeue(): T {
        var result: T
        while(stack1.isNotEmpty()) {
            stack2.push(stack1.pop())
        }
        result = stack2.pop()
        while(stack2.isNotEmpty()) {
            stack1.push(stack2.pop())
        }
        return result
    }

}