import java.util.HashSet;
//priya
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet to store characters in the current window
        HashSet<Character> set = new HashSet<>();
        int left = 0; // Left end of the sliding window
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If character is already in the set, remove from the left
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character and update max length
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // Optional main method to test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "abcabcbb";
        int result = sol.lengthOfLongestSubstring(input);
        System.out.println("Output: " + result); // Output: 3
    }
}