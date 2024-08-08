package DataStructuresImplementing.nodes.JavaNodes;

public class LinkedNode {
    public Object value;
    public LinkedNode next;
    public LinkedNode previous;

    public LinkedNode(Object value, LinkedNode next, LinkedNode previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}
