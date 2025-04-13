import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    currentRow.add(1);
                } else {
                    int sum = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                    currentRow.add(sum);
                }
            }

            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;  
        Solution sol = new Solution();
        List<List<Integer>> pascal = sol.generate(numRows);

        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : pascal) {
            System.out.println(row);
        }
    }
} //priya