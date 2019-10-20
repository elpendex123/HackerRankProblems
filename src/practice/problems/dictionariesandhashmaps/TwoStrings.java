package practice.problems.dictionariesandhashmaps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoStrings {
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        boolean match = false;
        StringBuilder stringBuilder = new StringBuilder();

//        if (s1.length() < s2.length()) {
//            System.out.println("s1 < s2");
            for (int i = 0; i < s1.length(); i++) {
                Character character = (char)s1.indexOf(i);
                stringBuilder.append(character);
                if (s2.contains(stringBuilder)) {
                    System.out.println("s2: " + s2.toString() + " contains: " + stringBuilder.toString());
                    match = true;
                    break;
                }
                stringBuilder.deleteCharAt(0);
            }
//        } else {
//            System.out.println("s2 < s1");
//            for (int j = 0; j < s2.length(); j++) {
//                stringBuilder.append(s2.indexOf(j));
//                if (s1.contains(stringBuilder)) {
//                    System.out.println("s1: " + s1.toString() + " contains: " + stringBuilder.toString());
//                    match = true;
//                    break;
//                }
//                stringBuilder = null;
//            }
//        }

        return match ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            String result = twoStrings(s1, s2);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}
