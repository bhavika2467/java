/*68. TASK 9 - STRINGBUILDER TOOLKIT
---------------------------------
Required filename: StringBuilderToolkit.java
Implement these static methods primarily with StringBuilder:
    static String reverse(String text)
    static String repeat(String text, int count)
    static String joinWords(String[] words, String separator)
    static String removeCharacterAt(String text, int index)
    static String replaceCharacterAt(String text, int index, char replacement)
    static String buildNumberedList(String[] items)
Requirements:
- use append(), insert() where suitable, deleteCharAt(), setCharAt(),
  reverse(), length(), charAt(), and toString() across the toolkit
- avoid repeated String concatenation inside loops
- define behavior for null, empty, invalid count, and invalid index inputs
- demonstrate that converting to String produces an immutable result even if
  the builder later changes
 */
public class StringBuilderToolKit {
    static String reverse(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }
    static String repeat(String text, int count) {
        if (text == null) {
            return null;
        }

        if (count < 0) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(text);
        }

        return sb.toString();
    }
    static String joinWords(String[] words, String separator) {

        if (words == null) {
            return null;
        }

        if (separator == null) {
            separator = "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            if (words[i] != null) {
                sb.append(words[i]);
            }

            if (i < words.length - 1) {
                sb.append(separator);
            }
        }

        return sb.toString();
    }


    // 4. Remove character at an index
    static String removeCharacterAt(String text, int index) {

        if (text == null) {
            return null;
        }

        if (index < 0 || index >= text.length()) {
            return text;
        }

        StringBuilder sb = new StringBuilder(text);

        sb.deleteCharAt(index);

        return sb.toString();
    }


    // 5. Replace character at an index
    static String replaceCharacterAt(
            String text, int index, char replacement) {

        if (text == null) {
            return null;
        }

        if (index < 0 || index >= text.length()) {
            return text;
        }

        StringBuilder sb = new StringBuilder(text);

        sb.setCharAt(index, replacement);

        return sb.toString();
    }


    // 6. Build a numbered list
    static String buildNumberedList(String[] items) {

        if (items == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < items.length; i++) {

            sb.append(i + 1);
            sb.append(". ");

            if (items[i] != null) {
                sb.append(items[i]);
            }

            if (i < items.length - 1) {
                sb.append('\n');
            }
        }

        return sb.toString();
    }


    // Driver
    public static void main(String[] args) {

        // -------------------------
        // reverse()
        // -------------------------

        System.out.println(
            "Reverse: " + reverse("Java")
        );

        System.out.println(
            "Reverse empty: " + reverse("")
        );

        System.out.println(
            "Reverse one character: " + reverse("A")
        );

        System.out.println(
            "Reverse null: " + reverse(null)
        );

        System.out.println();


        // -------------------------
        // repeat()
        // -------------------------

        System.out.println(
            "Repeat: " + repeat("Hi", 3)
        );

        System.out.println(
            "Repeat zero times: " + repeat("Hi", 0)
        );

        System.out.println(
            "Repeat invalid count: " + repeat("Hi", -1)
        );

        System.out.println();


        // -------------------------
        // joinWords()
        // -------------------------

        String[] words = {"Java", "Python", "C++"};

        System.out.println(
            "Joined: " + joinWords(words, " | ")
        );

        System.out.println(
            "Empty array: " + joinWords(new String[]{}, ", ")
        );

        System.out.println(
            "Null array: " + joinWords(null, ", ")
        );

        System.out.println();


        // -------------------------
        // removeCharacterAt()
        // -------------------------

        System.out.println(
            "Remove index 2: "
            + removeCharacterAt("Hello", 2)
        );

        System.out.println(
            "Invalid index: "
            + removeCharacterAt("Hello", 10)
        );

        System.out.println();


        // -------------------------
        // replaceCharacterAt()
        // -------------------------

        System.out.println(
            "Replace index 1: "
            + replaceCharacterAt("Hello", 1, 'a')
        );

        System.out.println(
            "Invalid index: "
            + replaceCharacterAt("Hello", 10, 'X')
        );

        System.out.println();


        // -------------------------
        // buildNumberedList()
        // -------------------------

        String[] items = {
            "Learn Java",
            "Practice DSA",
            "Build Projects"
        };

        System.out.println("Numbered List:");
        System.out.println(buildNumberedList(items));

        System.out.println();


        // -------------------------
        // StringBuilder vs String
        // -------------------------

        StringBuilder builder = new StringBuilder("Hello");

        String result = builder.toString();

        System.out.println("Before changing builder:");
        System.out.println("Builder: " + builder);
        System.out.println("String: " + result);

        // Change the builder
        builder.append(" World");

        System.out.println();

        System.out.println("After changing builder:");
        System.out.println("Builder: " + builder);
        System.out.println("String: " + result);
    }
}

