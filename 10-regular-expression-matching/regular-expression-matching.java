public class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
//priya
        // dp[i][j] = true if s[0..i-1] matches p[0..j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Empty string and empty pattern match
        dp[0][0] = true;

        // Deals with patterns like a*, a*b*, a*b*c* matching empty string
        for (int j = 2; j <= n; j += 2) {
            if (p.charAt(j - 1) == '*' && dp[0][j - 2]) {
                dp[0][j] = true;
            }
        }

        // Fill the table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '.' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    char prev = p.charAt(j - 2);
                    dp[i][j] = dp[i][j - 2]; // Treat * as zero occurrence

                    // If preceding char matches
                    if (prev == '.' || prev == sc) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j]; // One or more occurrence
                    }
                }
            }
        }

        return dp[m][n];
    }

    // Optional test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isMatch("aa", "a"));       // false
        System.out.println(sol.isMatch("aa", "a*"));      // true
        System.out.println(sol.isMatch("ab", ".*"));      // true
        System.out.println(sol.isMatch("mississippi", "mis*is*p*.")); // false
    }
}