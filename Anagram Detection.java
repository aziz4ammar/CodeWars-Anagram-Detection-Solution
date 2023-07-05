import java.util.Arrays;

public class Kata {
    public static boolean isAnagram(String test, String original) {
        // Convert strings to lowercase and remove whitespace
        String str1 = test.toLowerCase().replaceAll("\\s", "");
        String str2 = original.toLowerCase().replaceAll("\\s", "");

        // Check if the lengths of the two strings are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        boolean result = isAnagram(word1, word2);
        System.out.println("Are '" + word1 + "' and '" + word2 + "' anagrams? " + result);
    }
}