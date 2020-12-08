package datastructure.linkedlist.unidirectional

import datastructure.linkedlist.Node

class UniNode<T> constructor(val value: T, var isFirst: Boolean, var next: UniNode<T>?): Node {

    fun hasNext(): Boolean = this.next == null

}