package datastructure.linkedlist

interface List<T> {
    fun size(): Int
    fun hasNext(): Boolean
    fun next(): Node
    fun add(item: T): Unit
    fun delete(item: T): Unit
    fun printAll(): Unit
}