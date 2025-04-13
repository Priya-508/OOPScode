import java.util.Arrays;

public class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; 
            }
            digits[i] = 0; 
        }

        int[] result = new int[n + 1];
        result[0] = 1; 
        return result;
    }
//priya
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        int[] result = plusOne(digits);

        System.out.println("Output: " + Arrays.toString(result)); 
    }
}