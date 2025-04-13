class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Convert to 0-based index
            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            result.insert(0, ch);
            columnNumber /= 26;
        }

        return result.toString();
    }
} //priya