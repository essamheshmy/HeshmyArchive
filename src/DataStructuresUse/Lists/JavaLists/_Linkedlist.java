package DataStructuresUse.Lists.JavaLists;

import java.util.LinkedList;
import java.util.List;

//LinkedList is another common data structure in Java.
// It’s a doubly-linked list that stores elements in nodes.
// Each node contains a pointer to the next node and the previous node,
// making it efficient for adding and removing elements in the middle of the list.



public class _Linkedlist {
    public static void linkedlist() {
        //طريقة التخزين: يستخدم LinkedList سلسلة من العقد (nodes)، حيث يحتوي كل عقد على قيمة ومرجعين للعقد السابق والتالي.
        //ترتيب العناصر: العناصر في LinkedList يتم ترتيبها وفقًا لترتيب العقد، وليس بمؤشر.
        //الإضافة والحذف: إضافة أو حذف عنصر في LinkedList يتطلب فقط تعديل روابط العقد المجاورة، مما يجعل هذه العمليات أسرع من ArrayList، خاصة في منتصف القائمة.

        //linkedList vs ArrayList
        //ArrayList  Very good at arranging items but very bad at deleting and adding
        //linkedLis Better in adding and deleting but expensive in terms of storage

        //Here’s a simple example of how to use Linked List:
        List<String> linkedList = new LinkedList();

        //Added items in linled list
        linkedList.add("linked heshmy 1");
        linkedList.add("linked heshmy 2");
        linkedList.add("linked heshmy 3");
        linkedList.add("linked heshmy 4");
        linkedList.add("linked heshmy 5");

        //fetch list items
        System.out.println (linkedList);
        //Bring a list item
        System.out.println (linkedList.get(1));
        //Verify that the list is empty.
        System.out.println (linkedList.isEmpty());
        //Get list size
        System.out.println (linkedList.size());
        //Add an item to a specific location
        linkedList.set(1,"66");
        //fetch list items
        System.out.println (linkedList);
        //Bring the number one item in the list.
        System.out.println (linkedList.get(1));

// Note: There is almost no difference
// between the functions of the dynamic list and the linked list.
// However, the fundamental difference between them is in how these
// functions are implemented in the background and in the space used.

    }
}
