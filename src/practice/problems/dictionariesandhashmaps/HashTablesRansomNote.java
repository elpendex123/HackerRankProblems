package practice.problems.dictionariesandhashmaps;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashTablesRansomNote {
    static void checkMagazine(String[] magazine, String[] note) {
        boolean match = true;
        long noteKey = 0;
        long magazineKey = 0;

//        Map<Long, String> magazineList = new ConcurrentHashMap<>();
//        for (String s : magazine) {
//            magazineList.put(magazineKey, s);
//            magazineKey++;
//        }
//
//        Map<Long, String> noteList = new HashMap<>();
//        for (String s : note) {
//            noteList.put(noteKey, s);
//            noteKey++;
//        }

        // loop through notes values
        // if note value is found in magazine value
        // get magazine key for this value
        // remove magazine entry with key and value
        // else
        // set match to false

//        for (String n : noteList.values()) {
//            System.out.println("\nNOTE WORD: " + n);
//            for (Map.Entry<Long, String> mapEntry : magazineList.entrySet()) {
////                System.out.println("MAGAZINE KEY: " + mapEntry.getKey() + ", MAGAZINE VALUE: " + mapEntry.getValue());
//                if (!n.equals(mapEntry.getValue())) {
////                    System.out.println("NOTE WORD NOT FOUND IN MAGAZINE LIST: " + mapEntry.getValue());
//                    match = false;
//                    break;
//                } else {
//                    System.out.println("NOTE WORD FOUND IN MAGAZINE LIST: " + mapEntry.getValue());
//                    magazineList.remove(mapEntry.getKey());
//                }
//            }
//        }


//        mapEntry = magazineList.entrySet();
//        System.out.println("key: " + mapEntry.getKey() + ", value: " + mapEntry.getValue());

//        Set<Map.Entry<Long, String>> setEntryLongString = magazineList.entrySet();
//        for (Map.Entry<Long, String> entry: setEntryLongString)
//        {
//            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
//            if ("three".equals(entry.getValue()))
//            {
//                System.out.println("found three");
//            }
//            else
//            {
//                System.out.println("did not find three");
//            }
//        }


//        WORKS WITH ARRAYLIST!
        List<String> magazineList = new ArrayList<>();
        for (String s : magazine)
            magazineList.add(s);
        for (String n : note) {
            if (!magazineList.contains(n)) {
                match = false;
                break;
            } else {
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

        // YES
//        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
//        String[] note = {"give", "one", "grand", "today"};

        // NO
//        String[] magazine = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
//        String[] note = {"ive", "got", "some", "coconuts"};

        // NO
        String[] magazine = {"two", "times", "three", "is", "not", "four"};
        String[] note = {"two", "times", "two", "is", "four"};

        checkMagazine(magazine, note);
        scanner.close();
    }
}
