package DataStructuresUse.Lists.JavaLists;

import java.util.Stack;

//A Stack is a Last-In-First-Out (LIFO) data structure.
// It’s like a stack of plates;
// the last plate put on the stack is the first one to be used.
public class _Stack {
    public static void stack(){
        //Here’s an example of a Stack in action:
        Stack<String> books = new Stack<>();

        // Add books to stack
        books.push("Java Programming");
        books.push("Data Structures and Algorithms");
        books.push("Operating Systems");

        // Display the top book without removing it.
        System.out.println("The top book is: " + books.peek());

        // Remove and return a book
        String removedBook = books.pop();
        System.out.println("Removed book: " + removedBook);

        // Check if stack is empty
        System.out.println("Is the stack empty? " + books.isEmpty());

        // View all books
        while (!books.isEmpty()) {
            System.out.println(books.pop());
        }
    }
}
