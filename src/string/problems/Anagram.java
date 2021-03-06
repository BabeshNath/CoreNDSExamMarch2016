package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String str1 = "ARMY";
        String str2 = "MARY";
        if (isAnagram(str1, str2)) {
            System.out.println(str2 + " is anagram of " + str1);
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }

    private static boolean isAnagram(String str1, String str2) {

        // If string lengths are not same, the strings are not anagrams.
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort characters of both the strings.
        str1 = sortCharacters(str1);
        str2 = sortCharacters(str2);

        // After sorting if strings are equal then they are anagrams.
        return str1.equals(str2);
    }

    private static String sortCharacters(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}
