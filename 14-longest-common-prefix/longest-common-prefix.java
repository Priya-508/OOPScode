public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
//priya
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Shrink the prefix until it matches the beginning of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    // Main method with hardcoded input
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"flower", "flow", "flight"};
        String result = sol.longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result);
    }
}