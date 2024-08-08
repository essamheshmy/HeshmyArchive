package DataStructuresImplementing.Queue

class LinkedQueue<T> {
    private inner class Node<T>(val value: T) {
        var next: Node<T>? = null
    }

    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun enqueue(item: T) {
        val newNode = Node(item)
        if (isEmpty()) {
            head = newNode
        } else {
            tail?.next = newNode
        }
        tail = newNode
    }

    fun dequeue(): T? {
        if (isEmpty()) {
            return null
        }
        val item = head?.value
        head = head?.next
        if (head == null) {
            tail = null
        }
        return item
    }

    fun peek(): T? {
        return head?.value
    }

    fun isEmpty(): Boolean {
        return head == null
    }
}
