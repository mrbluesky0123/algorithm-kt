package datastructure.linkedlist.unidirectional

class Node<T> constructor(val value: T, var isHead: Boolean = false, var isTail: Boolean = false) {

    var next: Node<T>? = null

    fun hasNext(): Boolean = this.next != null

    fun next(): Node<T>? = this.next

    override fun equals(other: Any?): Boolean {
        return (other as Node<T>).value == this.value
    }

    override fun toString(): String {
        return "Node(value = ${value}, isHead = ${isHead}, isTail = ${isTail}, next = Node ${next?.value})"
    }

}