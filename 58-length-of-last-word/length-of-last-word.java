public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
//priya
    public static void main(String[] args) {
        String s = "This is your wordHere";
        Solution sol = new Solution();
        int len = sol.lengthOfLastWord(s);
        System.out.println("Length of last word: " + len);  
    }
}