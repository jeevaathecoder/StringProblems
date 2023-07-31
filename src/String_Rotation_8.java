public class String_Rotation_8 {

        public static String rightRotateString(String input, int positions) {
            if (input == null || input.isEmpty()) {
                return input; // Return the original string if it's empty or null
            }

            int length = input.length();
            positions %= length; // Handle cases where positions > length

            // Perform the right rotation
            String rotated = input.substring(length - positions) + input.substring(0, length - positions);

            return rotated;
        }

        public static void main(String[] args) {
            String input = "waterbottle";
            int positions = 1;

            String rotatedString = rightRotateString(input, positions);
            System.out.println("Original String: " + input);
            System.out.println("Right-Rotated String: " + rotatedString);
        }
    }
