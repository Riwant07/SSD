package lab02;

/**
 * The Counter interface provides methods for processing strings.
 */
public interface Counter {
    
    /**
     * Counts the number of words in a sentence.
     * @param sentence The sentence to analyze.
     * @return The number of words in the sentence.
     */
    int countWords(String sentence);
    
    /**
     * Counts the number of letters in a sentence (ignores spaces and special characters).
     * @param sentence The sentence to analyze.
     * @return The number of letters in the sentence.
     */
    int countLetters(String sentence);
    
    /**
     * Returns the total length of the sentence, including spaces.
     * @param sentence The sentence to analyze.
     * @return The length of the sentence.
     */
    int getLength(String sentence);
}
