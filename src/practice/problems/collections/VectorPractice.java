package practice.problems.collections;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("hello");
        vector.add("world");
        vector.add("good");
        vector.add("bye");
        vector.add("world");

        System.out.println("index at: " + vector.elementAt(1));
        System.out.println("size: " + vector.size());
        System.out.println("capacity: " + vector.capacity());
        System.out.println("to string: " + vector.toString());
        System.out.println(vector.remove("world"));
        System.out.println("to string: " + vector.toString());
        System.out.println(vector.remove("world"));
        System.out.println("to string: " + vector.toString());

//        vector.clear();
        System.out.println("size: " + vector.size());
        System.out.println("capacity: " + vector.capacity());

        Vector<String> vectorSmall = new Vector<>();
        vectorSmall.add("hello");
        vectorSmall.add("good");
        vectorSmall.add("bye");

        if (vector.containsAll(vectorSmall))
            System.out.println("big vector contains small vector");
        else
            System.out.println("big vector does not contain small vector");
    }
}
