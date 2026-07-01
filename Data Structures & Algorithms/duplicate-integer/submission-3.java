class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return false;
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        if(set.size() == nums.length) return false;
        return true;
    }
}