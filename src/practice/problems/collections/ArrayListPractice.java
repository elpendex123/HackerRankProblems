package practice.problems.collections;

import java.util.ArrayList;

public class ArrayListPractice
{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("0");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("3");

        System.out.println("output: " + arrayList.toString());
        System.out.println("size: " + arrayList.size());
        System.out.println("get(0): " + arrayList.get(0));
        System.out.println("index of 3: " + arrayList.indexOf("3"));
        System.out.println("last index of 3: " + arrayList.lastIndexOf("3"));

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("8");
        arrayList2.add("7");

        boolean removedOrNot = arrayList.removeAll(arrayList2);
        System.out.println("output after removing 3 and 7: " + arrayList.toString());
        System.out.println("removed or not: " + removedOrNot);
    }
}
