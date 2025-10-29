package homeworkSix;

import java.util.ArrayList;
import java.util.Scanner;

public class WordAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Kelime giriniz. (her kelimeden sonra entera basınız ve bitirmek için 'bitir' yazınız.):");

        //Read word from the user until 'bitir' is entered
        while (true) {
            String word = input.nextLine();

            if (word.equalsIgnoreCase("bitir")) {
                break;
            }

            words.add(word);
        }

        //List to store words tahan contain at least one repeated character
        ArrayList<String> duplicateWords = new ArrayList<>();

        for (String word : words) {
            if (findDuplicateLetter(word)) {  // boolean kontrol
                duplicateWords.add(word);
            }

            if (duplicateWords.size() == 2) {
                break; // Steop when we find 2 words with repeated letters
            }
        }

        if (duplicateWords.size() >= 2) {
            // Call TextGenerator class
            String generatedText = TextGenerator.generateText(
                    duplicateWords.get(0),
                    duplicateWords.get(1)
            );
            System.out.println("\nOluşturulan metin: " + generatedText);
        } else {
            System.out.println("\nYeterli sayıda tekrar eden harfli kelime bulunamadı.");
        }

        input.close();

    }

    // Method to check if a word contains a repeated character
    public static boolean findDuplicateLetter(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            for (int j = i + 1; j < word.length(); j++) {
                if (c == word.charAt(j)) {
                    return true;
                }
            }
        }
        return false; // No repeated letters found
    }
}
