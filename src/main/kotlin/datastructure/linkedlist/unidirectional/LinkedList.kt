package datastructure.linkedlist.unidirectional

class LinkedList<T> constructor() {

    var head: Node<T>?
    var tail: Node<T>?
    var length: Int = 0

    init {
        this.head = null
        this.tail = null
        this.length = 0
    }



    fun size(): Int = this.length

    fun prepend(item: T): Unit {
        var itemNode = this.getNewNode(item)

        if(this.head == null) {
            this.head = itemNode
            itemNode.isHead = true
            this.tail = itemNode
            itemNode.isTail = true
        } else {
            itemNode.isHead = true
            itemNode.next = this.head
            this.head = itemNode
            itemNode.next!!.isHead = false
            if(itemNode.next!!.hasNext()) {
                itemNode.next!!.isTail = false
            }
        }

        this.length++
    }

    fun append(item: T): Unit {
        if(this.tail == null) {
            this.prepend(item)
        } else {
            var itemNode = this.getNewNode(item)
            this.tail!!.next = itemNode
            this.tail!!.isTail = false

            this.tail = itemNode
            itemNode.isTail = true

            this.length++
        }
    }

    fun insert(item: T, after: T): Unit {
        if(this.head == null) {
            this.prepend(item)
        } else {
            this.insert(this.head!!, item, after)
        }
    }

    private fun insert(currentNode: Node<T>, item: T, after: T) {
        if(currentNode.value == after) {
            var itemNode = this.getNewNode(item)
            if(currentNode.hasNext()) {
                itemNode.next = currentNode.next!!
                currentNode.next = itemNode
            } else {
                currentNode.next = itemNode
                currentNode.isTail = false
                itemNode.isTail = true
            }
            this.length++
        } else {
            if(currentNode.hasNext()) {
                insert(currentNode.next!!, item, after)
            } else {
                return
            }
        }
    }

    fun remove(item: T): Unit {
        if(this.head == null) {
            return
        }
        this.remove(null, this.head!!, item)
    }

    private fun remove(beforeNode: Node<T>?, currentNode: Node<T>, item: T) {
        if(currentNode.value == item) {
            if(currentNode.hasNext()) {
                if(currentNode.isHead) {
                    this.head = currentNode.next!!
                    this.head!!.isHead = true
                    currentNode.next = null
                } else {
                    beforeNode!!.next = currentNode.next!!
                    currentNode.next = null
                }
            } else {
                beforeNode!!.next = null
                beforeNode.isTail = true
            }
            this.length--
        } else {
            if(currentNode.hasNext()) {
                this.remove(currentNode, currentNode.next!!, item)
            } else {
                return
            }
        }
    }

    fun getNewNode(item: T): Node<T> {
        return Node(item)
    }

    fun printAll(): String {
        return printNode(head)
    }

    fun printNode(target: Node<T>?): String {
        if(target == null) {
            return ""
        }else if(target.hasNext()) {
            return target.toString() + "\n" + printNode(target.next !!)
        } else {
            return target.toString()
        }
    }

    override fun toString(): String {
        return "\n< Linked List >\n" + "size = ${this.length}, head = ${this.head?.value}, tail = ${this.tail?.value}\n" + printAll()
    }

}