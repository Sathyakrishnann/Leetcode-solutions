class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = arr[0];
        int peak = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                peak = i;
            }
        }
        return peak;
    }
}