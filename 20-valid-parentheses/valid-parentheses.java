public class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
//priya
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch; // Push to stack
            } else {
                if (top == -1) return false; // Stack is empty, no matching open
                char open = stack[top--];   // Pop from stack
                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }

        return top == -1; 
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String input1 = "()";
        String input2 = "({[]})";
        String input3 = "(]";

        System.out.println("Input: " + input1 + " => " + sol.isValid(input1)); 
        System.out.println("Input: " + input2 + " => " + sol.isValid(input2)); 
        System.out.println("Input: " + input3 + " => " + sol.isValid(input3));
    }
}