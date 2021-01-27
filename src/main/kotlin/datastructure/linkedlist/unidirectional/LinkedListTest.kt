package datastructure.linkedlist.unidirectional

fun main(args: Array<String>) {
    // Init linked list
    var linkedList: LinkedList<String> = LinkedList()

    // Check linked list
    println(linkedList.toString())

    // Add some
    linkedList.append("A")
    linkedList.append("B")
    linkedList.append("C")
    linkedList.append("D")
    linkedList.append("e")
    println(linkedList.toString())

    // Remove
    linkedList.remove("C")
    println(linkedList.toString())

    // Insert
    linkedList.insert("FF", "D")
    println(linkedList.toString())

    // Remove
    linkedList.remove("B")
    println(linkedList.toString())

    // Prepend
    linkedList.prepend("Q")
    println(linkedList.toString())

    // Remove
    linkedList.remove("Q")
    println(linkedList.toString())

    // Remove
    linkedList.remove("A")
    linkedList.remove("D")
    linkedList.remove("FF")
    println(linkedList.toString())

}