package practice.problems.dictionariesandhashmaps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        LinkedList<Character> s1List = new LinkedList<>();
        LinkedList<Character> s2List = new LinkedList<>();

        for (int i = 0; i < s1.length(); i++)
            s1List.add(s1.charAt(i));

        for (int j = 0; j < s2.length(); j++)
            s2List.add(s2.charAt(j));

        Collections.sort(s1List);
        Collections.sort(s2List);

        System.out.println("s1list: " + s1List.toString());
        System.out.println("s2list: " + s2List.toString());

        int loop = s1List.size() < 27 ? s1List.size() : 27;

        for (int k = 0; k < loop; k++)
            if (s2List.contains(s1List.get(k)))
                return "YES";

        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            long start = System.currentTimeMillis();
            String result = twoStrings(s1, s2);
            long end = System.currentTimeMillis();
            System.out.println("time it took: " + (end - start) + " ms");

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}
