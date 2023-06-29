import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String reverseWords(final String original) {

        String[] words = original.split(" ");
        String[] wordsReversed = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder();
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord.append(words[i].charAt(j));
            }
            wordsReversed[i] = reversedWord.toString();
        }

        return String.join(" ", wordsReversed);
    }




    public static void main(String[] args) {
        System.out.println(reverseWords("Hello World"));
    }
}