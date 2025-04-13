public class Solution {
    public int reverse(int x) {
        int result = 0;
//priya
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || 
                (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || 
                (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            result = result * 10 + digit;
        }

        return result;
    }

    // Main method with hardcoded input
    public static void main(String[] args) {
        int x = -4567; // Change this input to try other cases
        Solution solution = new Solution();
        int reversed = solution.reverse(x);
        System.out.println("Input: " + x);
        System.out.println("Reversed: " + reversed);
    }
}