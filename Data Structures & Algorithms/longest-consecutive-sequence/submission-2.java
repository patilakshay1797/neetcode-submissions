class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longConsSeq = 0;
        int currentLong = 0;

        if(nums.length == 0) return 0;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i+1] == nums[i] + 1) {
                currentLong++;
            }else if(nums[i+1] != nums[i]) {
                currentLong = 0;
            }
            if(currentLong > longConsSeq) {
                longConsSeq = currentLong;
            }
        }

        return longConsSeq + 1;
    }
}
