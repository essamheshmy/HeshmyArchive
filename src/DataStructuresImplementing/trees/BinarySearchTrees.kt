package DataStructuresImplementing.trees

class Node(var data: Int) {
    var left: Node? = null
    var right: Node? = null
}

class BinarySearchTree {
    var root: Node? = null

    fun insert(data: Int) {
        root = insertRec(root, data)
    }

    private fun insertRec(node: Node?, data: Int): Node? {
        if (node == null) {
            return Node(data)
        }

        if (data < node.data) {
            node.left = insertRec(node.left, data)
        } else if (data > node.data) {
            node.right = insertRec(node.right, data)
        }

        return node
    }

    fun search(root: Node?, key: Int): Boolean {
        if (root == null)
            return false
        if (root.data == key)
            return true
        return if (key < root.data)
            search(root.left, key)
        else
            search(root.right, key)
    }
}
