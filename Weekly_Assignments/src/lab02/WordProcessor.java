package lab02;

/**
 * WordProcessor implements the Counter interface to analyze sentences.
 */
public class WordProcessor implements Counter {

    /**
     * Counts the number of words in a sentence by splitting on spaces.
     * @param sentence The sentence to analyze.
     * @return The number of words in the sentence.
     */
    @Override
    public int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split(" "); // Split on one or more spaces
        return words.length;
    }

    /**
     * Counts the number of letters in a sentence (ignores spaces and special characters).
     * @param sentence The sentence to analyze.
     * @return The number of letters in the sentence.
     */
    @Override
    public int countLetters(String sentence) {
        int letters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }

    /**
     * Returns the total length of the sentence, including spaces and special characters.
     * @param sentence The sentence to analyze.
     * @return The length of the sentence.
     */
    @Override
    public int getLength(String sentence) {
        return sentence.length();
    }
}
