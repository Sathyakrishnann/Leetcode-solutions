class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(0, nums, result);
        return result;
    }
    private void solve(int start, int[] nums, List<List<Integer>> result) {
         if (start == nums.length) {
            List<Integer> current = new ArrayList<>();
            for (int n : nums) current.add(n);
            result.add(current);
            return;
        }
        for (int i = start; i < nums.length; i++) {
          swap(nums, start, i);
             solve(start + 1, nums, result);        
            swap(nums, start, i);
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}