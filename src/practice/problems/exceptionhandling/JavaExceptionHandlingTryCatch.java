package practice.problems.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// TODO: NEED TO RETURN STRING OUTPUT TO STDOUT INSTEAD OF ACTUAL EXCEPTION
public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        int xInt, yInt, zInt = 0;
//        String x = args[0];
//        String y = args[1];

//        String x = "10";
//        String y = "3";

//        String x = "10";
//        String y = "Hello";

//        String x = "10";
//        String y = "0";

//        String x = "23.323";
//        String y = "0";

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter x: ");
        String x = scanner.next();
//        System.out.print("Enter y: ");
        String y = scanner.next();

        try {
            if (x.contains(".") || y.contains("."))
                throw new InputMismatchException();
            if (x.toLowerCase().matches("\\p{javaLowerCase}+") || y.toLowerCase().matches("\\p{javaLowerCase}+"))
                throw new InputMismatchException();
            if (y.equals("0"))
                throw new ArithmeticException();

            xInt = Integer.parseInt(x);
            yInt = Integer.parseInt(y);
            zInt = xInt / yInt;
        } catch (InputMismatchException ime) {
            ime.printStackTrace();
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }

        System.out.println(zInt);
    }
}

//Sample Input 0: 10 3
//Sample Output 0: 3
//
//Sample Input 1: 10 Hello
//Sample Output 1: java.util.InputMismatchException
//
//Sample Input 2: 10 0
//Sample Output 2: java.lang.ArithmeticException: / by zero
//
//Sample Input 3: 23.323 0
//Sample Output 3: java.util.InputMismatchException
