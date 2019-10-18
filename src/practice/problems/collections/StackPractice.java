package practice.problems.collections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("adding elements...");

        stack.push("{");
        stack.push("(");
        stack.push("hello world");
        stack.push(")");
        stack.push("}");

        System.out.println("size: " + stack.size());
        System.out.println("clearing elements...");
        stack.clear();
        System.out.println("size: " + stack.size());
        System.out.println("adding elements again...");

        stack.push("{");
        stack.push("(");
        stack.push("hello world");
        stack.push(")");
        stack.push("}");

        System.out.println("top element: " + stack.peek());

        for(String element: stack)
        {
            System.out.println("element: " + element);
        }

        System.out.println("size after popping: " + stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
//        System.out.println("peeking: " + stack.peek()+ ", and size: " + stack.size()); // error
        System.out.println("size after popping: " + stack.size());
    }
}
