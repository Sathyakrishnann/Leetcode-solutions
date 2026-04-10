class Solution {
    public void moveZeroes(int[] nums) {
        int lastnum = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastnum] = nums[i];
                lastnum++;
            }
        }
        for (int i = lastnum; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}