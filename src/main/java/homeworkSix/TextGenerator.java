package homeworkSix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class TextGenerator {

    public static String generateText(String word1, String word2) {
        ArrayList<Character> combined = new ArrayList<>();
        HashSet<Character> used = new HashSet<>();

        // Add letters of the first word and ignore duplicates
        for (char c : word1.toCharArray()) {
            if (!used.contains(c)) {
                combined.add(c);
                used.add(c);
            }
        }

        // Add letters of the second word and skip letter already use
        for (char c : word2.toCharArray()) {
            if (!used.contains(c)) {
                combined.add(c);
                used.add(c);
            }
        }

        // Make letters random
        Collections.shuffle(combined);

        // Convert the list of character into a string
        StringBuilder result = new StringBuilder();
        for (char c : combined) {
            result.append(c);
        }

        return result.toString();
    }
}
