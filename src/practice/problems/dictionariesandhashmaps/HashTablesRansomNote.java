package practice.problems.dictionariesandhashmaps;

import java.util.LinkedList;
import java.util.Scanner;

public class HashTablesRansomNote {
    static void checkMagazine(String[] magazine, String[] note) {
        boolean match = true;
        long noteKey = 0;
        long magazineKey = 0;

        LinkedList<String> magazineList = new LinkedList<>();
        LinkedList<String> noteList = new LinkedList<>();

        for (String m: magazine)
        {
            magazineList.add(m);
        }

        for (String n: note)
        {
            noteList.add(n);
        }

        for (String nl : noteList) {
            if (!magazineList.remove(nl)) {
                match = false;
                break;
            }
        }
        System.out.println(match ? "Yes" : "No");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // YES
        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};

        // NO
//        String[] magazine = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
//        String[] note = {"ive", "got", "some", "coconuts"};

        // NO
//        String[] magazine = {"two", "times", "three", "is", "not", "four"};
//        String[] note = {"two", "times", "two", "is", "four"};

        checkMagazine(magazine, note);
        scanner.close();
    }
}
