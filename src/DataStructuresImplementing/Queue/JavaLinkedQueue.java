package DataStructuresImplementing.Queue;


import DataStructuresImplementing.nodes.JavaNodes.LinkedNode;

public class JavaLinkedQueue<T> {
    LinkedNode Rear;
    LinkedNode Front;
    public JavaLinkedQueue() {
        Rear= null;
        Front=null;
    }
    public void Queue(Object value){
        LinkedNode newNode=new  LinkedNode(value, null,null);
        if(Rear==null || Front==null){
            Rear=newNode;
            Front=newNode;
        }
        else{
            newNode.next=null;
            newNode.previous=Rear;
            Rear.next=newNode;
            Rear=newNode;
        }
    }
    public T Dequeue(){
        if(Rear==null || Front==null){
            System.out.println("queue is emplty");
            return null;
        }
        T value= (T)Front.value;
        Front= Front.next;
        if(Front !=null)
            Front.previous=null;
        return  value;

    }


}
