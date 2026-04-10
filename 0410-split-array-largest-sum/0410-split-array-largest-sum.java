class Solution {
    public boolean splitArrays(int mid, int[] nums, int k) {
        int sum = 0, d = 1;
        for (int i : nums) {
            if (sum + i <= mid) {
                sum += i;
            } else {
                d += 1;
                sum = i;
            }
        }
        return d <= k;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (splitArrays(mid, nums, k)) {
                high = mid- 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}