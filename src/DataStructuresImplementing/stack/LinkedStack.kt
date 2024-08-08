package DataStructuresImplementing.stack

import DataStructuresImplementing.nodes.Node

class LinkedStack {
    private var top: Node? = null

    fun push(data: Int) {
        val newNode = Node(data)
        newNode.next = top
        top = newNode
    }

    fun pop(): Int? {
        if (isEmpty()) {
            return null
        }
        val data = top?.data
        top = top?.next
        return data
    }

    fun peek(): Int? {
        return top?.data
    }

    fun isEmpty(): Boolean {
        return top == null
    }
}