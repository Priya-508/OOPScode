public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
//priya
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindrome
            int len1 = expandAroundCenter(s, i, i);
            // Even-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            // Update the start and end pointers
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Expand around the center and return the length of the palindrome
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "babad";
        String result = sol.longestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + result);
        // Output: "bab" or "aba"
    }
}