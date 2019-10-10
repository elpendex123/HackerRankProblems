package practice.problems.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// TODO: NEED TO RETURN STRING OUTPUT TO STDOUT INSTEAD OF ACTUAL EXCEPTION
public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        int xInt, yInt, zInt = 0;
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();

        try {
            if (x.toLowerCase().matches("^\\D+") || y.toLowerCase().matches("^\\D+"))
                throw new InputMismatchException();

            if (x.contains(".") || y.contains("."))
                throw new InputMismatchException();

            if (y.equals("0"))
                throw new ArithmeticException();

            xInt = Integer.parseInt(x);
            yInt = Integer.parseInt(y);

            zInt = xInt / yInt;
            System.out.println(zInt);
        } catch (InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (NumberFormatException nfe) {
            System.out.println("java.util.InputMismatchException");
        }
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
