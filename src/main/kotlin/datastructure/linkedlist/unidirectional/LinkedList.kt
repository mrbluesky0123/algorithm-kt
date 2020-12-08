package datastructure.linkedlist.unidirectional

class LinkedList<T> constructor(var head: Node<T>) {

    var length: Int = 0
    var tail = this.head

    fun size(): Int = this.length

    fun prepend(item: Node<T>): Unit {
        item.next = this.head
        this.head = item
    }

    fun append(item: Node<T>): Unit {
        this.tail = item
        this.append(head, item)
    }

    fun append(target: Node<T>, item: Node<T>): Unit {
        if(target.hasNext()) {
            this.append(target.next() !!, item)
        } else {
            target.next = item
        }
    }
     
    fun pop(): Node<T> {
        return this.tail
    }

    fun remove(item: Node<T>): Unit {
        
    }

    fun printAll() {
        TODO("Not yet implemented")
    }

}