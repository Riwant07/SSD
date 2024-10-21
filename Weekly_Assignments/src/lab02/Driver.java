package lab02;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input some text
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Create an instance of WordProcessor
        Counter processor = new WordProcessor();  // DataType of the instance is Counter (interface)

        // Call methods and print results
        System.out.println("Number of words: " + processor.countWords(sentence));
        System.out.println("Number of letters: " + processor.countLetters(sentence));
        System.out.println("Length of the sentence: " + processor.getLength(sentence));

        // Close scanner
        scanner.close();
    }
}
