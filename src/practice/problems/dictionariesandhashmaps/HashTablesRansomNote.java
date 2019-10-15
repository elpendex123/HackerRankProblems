package practice.problems.dictionariesandhashmaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HashTablesRansomNote {
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        List<String> magazineList = new ArrayList<>();
        List<String> noteList = new ArrayList<>();
        boolean match = true;

        for (String s : magazine)
            magazineList.add(s);

        for (String s : note)
            noteList.add(s);

        for (String n : noteList) {
            if (!magazineList.contains(n))
                match = false;
            else {
                magazineList.remove(n);
            }
        }

        System.out.println(match ? "Yes" : "No");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String[] mn = scanner.nextLine().split(" ");
//        int m = Integer.parseInt(mn[0]);
//        int n = Integer.parseInt(mn[1]);
//        String[] magazine = new String[m];
//        String[] magazineItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < m; i++) {
//            String magazineItem = magazineItems[i];
//            magazine[i] = magazineItem;
//        }
//
//        String[] note = new String[n];
//        String[] noteItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            String noteItem = noteItems[i];
//            note[i] = noteItem;
//        }

        // GOOD ONE:
//        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
//        String[] note = {"give", "one", "grand", "today"};

        // GOOD OR BAD
        String[] magazine = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] note = {"ive", "got", "some", "coconuts"};

        // GOOD OR BAD
//        String[] magazine = {""};
//        String[] note = {""};

        checkMagazine(magazine, note);
        scanner.close();
    }
}
