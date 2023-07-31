public class String_Compression_7 {

        public static String compressString(String input) {
            if (input == null || input.isEmpty()) {
                return input; // Return the original string if it's empty or null
            }

            StringBuilder compressed = new StringBuilder();
            int count = 1;

            for (int i = 0; i < input.length() - 1; i++) {
                char currentChar = input.charAt(i);
                char nextChar = input.charAt(i + 1);

                if (currentChar == nextChar) {
                    count++;
                } else {
                    compressed.append(currentChar).append(count);
                    count = 1;
                }
            }

            // Append the last character and its count
            compressed.append(input.charAt(input.length() - 1)).append(count);

            // Check if the compressed string is shorter than the original string
            String compressedString = compressed.toString();
            return compressedString.length() < input.length() ? compressedString : input;
        }

        public static void main(String[] args) {
            String input = "aabeccaaa";
            String compressedString = compressString(input);
            System.out.println("Compressed string: " + compressedString);
        }
    }



