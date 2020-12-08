package book.linkedlist

import java.util.*

fun main(args: Array<String>) {
    var linkedList = LinkedList<String>()
    linkedList.add("1")
    linkedList.add("2")
    linkedList.add("3")
    linkedList.add("4")
    linkedList.add("2")
    linkedList.add("5")
    linkedList.add("6")
    linkedList.add("4")

    var it = linkedList.iterator()
    var resultLinkedList = LinkedList<String>()
    while(it.hasNext()) {

    }
}