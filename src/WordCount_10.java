public class WordCount_10 {

        public static int countWords(String sentence) {
            if (sentence == null || sentence.isEmpty()) {
                return 0; // Return 0 if the sentence is empty or null
            }

            // Split the sentence by whitespace to get individual words
            String[] words = sentence.split("\\s+");

            // Return the number of words in the sentence
            return words.length;
        }

        public static void main(String[] args) {
            String sentence = "This is a sample sentence with some words.";
            int wordCount = countWords(sentence);
            System.out.println("Number of words: " + wordCount);
        }
    }

