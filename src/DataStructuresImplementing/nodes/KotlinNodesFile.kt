package DataStructuresImplementing.nodes

class Node(var data: Int) {
    var next: Node? = null
}
data class LinkedNode<T>(var value: T, var next: LinkedNode<T>? = null)