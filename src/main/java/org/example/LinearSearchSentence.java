package org.example;

import java.util.Scanner;

public class LinearSearchSentence {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // Return the first sentence containing the word
            }
        }
        return "Not Found"; // Return "Not Found" if the word is not present in any sentence
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sentences: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] sentences = new String[n];
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = scanner.nextLine();
        }

        System.out.print("Enter the word to search for: ");
        String word = scanner.nextLine();

        String result = findSentenceWithWord(sentences, word);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

