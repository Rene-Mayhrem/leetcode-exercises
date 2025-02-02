public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Solution solution = new Solution();
        // Test case 1: Both words have the same length
        String result1 = solution.mergeAlternately("abc", "def");
        System.out.println("Test case 1: " + result1); // Expected: "adbecf"

        // Test case 2: First word is longer than the second
        String result2 = solution.mergeAlternately("abcd", "ef");
        System.out.println("Test case 2: " + result2); // Expected: "aebfc"

        // Test case 3: Second word is longer than the first
        String result3 = solution.mergeAlternately("ab", "cdef");
        System.out.println("Test case 3: " + result3); // Expected: "acbdef"

        // Test case 4: One of the words is empty
        String result4 = solution.mergeAlternately("", "xyz");
        System.out.println("Test case 4: " + result4); // Expected: "xyz"

        // Test case 5: Both words are empty
        String result5 = solution.mergeAlternately("", "");
        System.out.println("Test case 5: " + result5); // Expected: ""
    }
}
