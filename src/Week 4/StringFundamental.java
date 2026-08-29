/* 67. TASK 8 - STRING FUNDAMENTALS AND LEETCODE
---------------------------------------------
Required filename: StringFundamentals.java
Implement these static methods without regular expressions:
    static boolean hasText(String value)
    static String normalizeCourseCode(String code)
    static int countOccurrences(String text, char target)
    static int lengthOfLastWord(String text)
    static void reverseString(char[] characters)
Requirements:
- hasText must distinguish null, empty, blank, and non-blank Strings
- normalizeCourseCode trims and converts to uppercase
- countOccurrences scans using length() and charAt()
- lengthOfLastWord implements LeetCode 58 using a backward scan
- reverseString implements LeetCode 344 in place using two pointers
- test normal, empty, one-character, trailing-space, and null cases where the
  method contract permits null
*/ 
public class StringFundamental {
    static boolean hasText(String value) {
        if (value == null) {
            return false;
        }
        return true;
    }
    static String normalizeCourseCode(String code) {
        return code.trim().toUpperCase();
    }
    static int countOccurrences(String text, char target) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    static void reverseString(char[] characters) {
        int left = 0;
        int right = characters.length - 1;
        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
    }
public static void main(String[] args) {
    System.out.println(hasText(null));
    System.out.println(hasText(""));
    System.out.println(hasText("   "));
    System.out.println(hasText("Java"));
    System.out.println(normalizeCourseCode("  cs101  "));
    System.out.println(countOccurrences("banana", 'a'));
    System.out.println(countOccurrences("hello", 'l'));
    System.out.println(countOccurrences("", 'a'));
    char[] characters = {'h', 'e', 'l', 'l', 'o'};
    reverseString(characters);
    System.out.println("After reverse:");
    System.out.println(characters);
    char[] oneCharacter = {'A'};
    reverseString(oneCharacter);
    System.out.println("One character:");
    System.out.println(oneCharacter);
}
}

