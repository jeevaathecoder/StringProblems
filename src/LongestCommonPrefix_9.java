public class LongestCommonPrefix_9 {

        public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return ""; // If the array is empty or null, return an empty string
            }

            String longestCommonPrefix = strs[0]; // Initialize LCP as the first string

            // Iterate through the rest of the strings
            for (int i = 1; i < strs.length; i++) {
                String currentString = strs[i];

                // Find the common prefix between LCP and the current string
                int j = 0;
                while (j < longestCommonPrefix.length() && j < currentString.length()
                        && longestCommonPrefix.charAt(j) == currentString.charAt(j)) {
                    j++;
                }

                // Update LCP to be the common prefix found
                longestCommonPrefix = longestCommonPrefix.substring(0, j);
            }

            return longestCommonPrefix;
        }

        public static void main(String[] args) {
            String[] strs = { "flower", "flow", "flight" };
            String lcp = longestCommonPrefix(strs);
            System.out.println("Longest Common Prefix: " + lcp);
        }
    }

