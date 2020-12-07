package datastructure.linkedlist.unidirectional

class Node<T> constructor(val value: T, var isFirst: Boolean, var next: Node<T>?) {

    fun hasNext(): Boolean = this.next == null

}