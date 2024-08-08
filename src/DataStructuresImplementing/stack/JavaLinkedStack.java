package DataStructuresImplementing.stack;


import DataStructuresImplementing.nodes.JavaNodes.Node;

public class JavaLinkedStack<T> {
    Node top;
    public JavaLinkedStack() {
        top= null;
    }
    public void push(Object value){
        Node newNode=new Node(value,null);
        if(top==null)
            top=newNode;
        else{
            newNode.next=top;
            top= newNode;
        }
    }
    public T  pop(){
        if(top==null){
            System.out.println("stack is emplty");
            return null;
        }
        T value=(T) top.value;
        top=top.next;
        return value;
    }



}
