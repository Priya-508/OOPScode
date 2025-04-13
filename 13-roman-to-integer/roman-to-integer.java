public class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;
//priya
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = getValue(s.charAt(i));
            if (current < prevValue) {
                total -= current;
            } else {
                total += current;
            }
            prevValue = current;
        }

        return total;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    // Optional main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        String roman = "MCMXCIV"; // 1994
        int result = sol.romanToInt(roman);
        System.out.println("The integer value of " + roman + " is: " + result);
    }
}