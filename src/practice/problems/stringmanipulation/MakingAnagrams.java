package practice.problems.stringmanipulation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakingAnagrams {
    static int makeAnagram(String a, String b) {
        String c = a + b;
        int total = c.length();
        int counter = 0;
        int location;

        List<Character> charA = new ArrayList<>();
        List<Character> charB = new ArrayList<>();

        for (char ch : a.toCharArray())
            charA.add(ch);

        for (char ch : b.toCharArray())
            charB.add(ch);

        Collections.sort(charA);
        Collections.sort(charB);

        for (int i = 0; i < a.length(); i++) {
            if (charB.contains(charA.get(i))) {
                location = charB.indexOf(charA.get(i));
                charA.set(i, '-');
                charB.set(location, '-');
                counter = counter + 2;
            }
        }

        return total - counter;
    }

    public static void main(String[] args) throws IOException {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        System.out.println("output = " + makeAnagram(a, b));
    }
}