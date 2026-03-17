package Stack;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushing elements: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Size of stack: " + stack.size());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after popping an element: " + stack);
    }
}
