package DataStructuresImplementing.stack;

public class javaStack<T>{
    private final int maxSize;
    private int top;
    private T[] Storage;

    public javaStack(int size){
        maxSize = size;
       // Storage = new T [maxSize];
        top = -1;
    }

    public void push(T value) {
        if (top < maxSize - 1) {
            top++;
            Storage[top] = value;
        } else {
            System.out.println("الاستاك ممتلئ، لا يمكن إضافة المزيد من العناصر");
        }
    }

    public T pop() {
        if (top >= 0) return  Storage[top--];
        else {
            System.out.println("الاستاك فارغ، لا يمكن إزالة المزيد من العناصر");
            return null;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

