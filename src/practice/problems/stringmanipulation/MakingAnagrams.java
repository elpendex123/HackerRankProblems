package practice.problems.stringmanipulation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MakingAnagrams {
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        // expected output is 4

        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String a = "cde";
        String b = "abc";
        System.out.println("output = " + makeAnagram(a, b));

//        String output = "output.txt";
//        System.out.println("Environment variable: " + System.getenv("USER"));
//        System.out.println("Environment variable: " + System.getenv("OUTPUT_PATH"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//        String fileLocation = "/home/kike/Documents/workspace-spring-tool-suite-4-4.3.2.RELEASE/HackerRankProblems/output/output.txt";
//        File file = new File(fileLocation);
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileLocation));
//        System.out.print("Enter first string: ");
//        String a = scanner.nextLine();
//        System.out.print("Enter second string: ");
//        String b = scanner.nextLine();
//        int res = makeAnagram(a, b);
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//        bufferedWriter.close();
//        System.out.println("output: " + res);
        scanner.close();
    }
}
