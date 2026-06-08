class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;

            int remainingSum = 0 - nums[i];
            
            while(l < r) {
                if((nums[i] + nums[l] + nums[r]) == 0 && i != r) {
                    List<Integer> threeSum = Arrays.asList(nums[i], nums[l], nums[r]);
                    if(!result.contains(threeSum))
                        result.add(threeSum);
                    l++;
                    r--;
                } else if((nums[l] + nums[r]) < remainingSum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}
