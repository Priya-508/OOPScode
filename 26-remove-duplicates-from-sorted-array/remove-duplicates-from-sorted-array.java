public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
//priya
        int k = 1; // Points to the next position to insert a unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}