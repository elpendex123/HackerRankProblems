package practice.problems.sorting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MarkAndToys {
    static int maximumToys(int[] prices, int k) {
        List<Integer> arrayListPrices = new ArrayList<>();
        for (int i : prices)
            arrayListPrices.add(i);

        Collections.sort(arrayListPrices);

        System.out.println("array list: ");
        System.out.println(arrayListPrices);

        int sum = arrayListPrices.get(0);
        int count = 0;

        for (int j = 1; j < arrayListPrices.size(); j++) {
            if (sum > k) {
                break;
            }

            sum += arrayListPrices.get(j);
            count++;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] prices = new int[n];
        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
