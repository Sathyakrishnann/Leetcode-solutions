class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num : nums){
            int n = result.size();
            for(int i=0; i<n; ++i){
                List<Integer> currentSubset = new ArrayList<>(result.get(i));
                currentSubset.add(num);    
                result.add(currentSubset);
            }
        }
        return result;
    }
}