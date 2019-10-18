package practice.problems.collections;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedList<String> linkedList2 = new LinkedList<>();

        linkedList.add("1");
        linkedList.add(1,"4");

        linkedList2.add("2");
        linkedList2.add("3");

        System.out.println("linkedList: " + linkedList.toString());
        System.out.println("linkedList2: " + linkedList2.toString());

        linkedList.addAll(1, linkedList2);

        System.out.println("l2 into l1: " + linkedList.toString());
        System.out.println("linkedList size: " + linkedList.size());

        linkedList.addFirst("0");
        linkedList.addLast("5");

        System.out.println("linkedList: " + linkedList.toString());

        System.out.println("element: " + linkedList.element());

        System.out.println("remove output after removing string 3: " + linkedList.remove("3"));
        System.out.println("linkedList: " + linkedList.toString());
    }
}
