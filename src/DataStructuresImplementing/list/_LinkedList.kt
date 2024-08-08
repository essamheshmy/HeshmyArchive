package DataStructuresImplementing.list

import DataStructuresImplementing.nodes.LinkedNode


class LinkedList<T> {
    private var head: LinkedNode<T>? = null

    fun add(value: T) {
        val newNode = LinkedNode(value)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    fun printList() {
        var current = head
        while (current != null) {
            print("${current.value} -> ")
            current = current.next
        }
        println("null")
    }
}
