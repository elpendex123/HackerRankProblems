package practice.problems.stringmanipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

// TODO: STILL WORKING ON THIS SOLUTION!!!
public class SherlockAndTheValidString {
    static String isValid(String s) {
        List<Character> characterList = new ArrayList<>();

        for (char c : s.toCharArray())
            characterList.add(c);

        System.out.println("before sorting: " + characterList);
        Collections.sort(characterList);
        System.out.println("after sorting: " + characterList);

        Set<Character> uniqueCharacters = new HashSet<>();
        uniqueCharacters.addAll(characterList);
        System.out.println("added to hash set: " + uniqueCharacters);

        ArrayList<Integer> countPerCharacter = new ArrayList<>();

        int count = 0;

        for (char c : uniqueCharacters) {
            for (int i = 0; i < characterList.size(); i++) {
                if (characterList.contains(c)) {
                    count++;
                    characterList.set(characterList.indexOf(c), null);
                }
            }
            countPerCharacter.add(count);
            count = 0;
        }

        System.out.println("arraylist of counts before: " + countPerCharacter);
        Collections.sort(countPerCharacter);
        System.out.println("arraylist of counts after: " + countPerCharacter);

        int lengthOfCounts = countPerCharacter.size();
        int last = countPerCharacter.get(lengthOfCounts - 1);
        int beforeLast = countPerCharacter.get(lengthOfCounts - 2);
        System.out.println("last: " + last);
        System.out.println("before last: " + beforeLast
        );

        if(last - beforeLast == 0 || last - beforeLast == 1)
            return "YES";
        else
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//        String s = scanner.nextLine();
//        String result = isValid(s);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//        bufferedWriter.close();
//        scanner.close();
        System.out.println(isValid("abcdefghhgfedecba"));
    }
}
