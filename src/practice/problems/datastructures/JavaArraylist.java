package practice.problems.datastructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
//        List<String> myLines1 = readMyFile("input/input1.txt");
//        List<String> myLines2 = readMyFile("input/input2.txt");

        List<String> myLines1 = new ArrayList<>();
        List<String> myLines2 = new ArrayList<>();
        String temp;
        Scanner scanner = new Scanner(System.in);

        int dataLines = scanner.nextInt();
        for (int j = 0; j <= dataLines; j++) {
            temp = scanner.nextLine();
            myLines1.add(temp);
        }

        int findInLines = scanner.nextInt();
        for (int j = 0; j <= findInLines; j++) {
            temp = scanner.nextLine();
            myLines2.add(temp);
        }

        for (int i = 1; i < myLines2.size(); i++) {
            String[] lineAndValue = myLines2.get(i).split(" ");
            int readLineNumber = Integer.parseInt(lineAndValue[0]);
            int fetchValueFromLine = Integer.parseInt(lineAndValue[1]);

            String[] splitMyIndexLine = myLines1.get(readLineNumber).split(" ");

            if (fetchValueFromLine < splitMyIndexLine.length)
                System.out.println(splitMyIndexLine[fetchValueFromLine]);
            else
                System.out.println("ERROR!");
        }
    }

    // in case we want to read in from file instead of from manual input
    private static ArrayList<String> readMyFile(String filename) {
        ArrayList<String> lines = new ArrayList<>();
        String line;

        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            lines.add(line);

            while (line != null) {
                line = bufferedReader.readLine();
                lines.add(line);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            lines.remove(lines.size() - 1);
        }

        return lines;
    }
}
