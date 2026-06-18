class Solution {
    public int search(int[] nums, int target) {
        int firstIndex = 0;
        int lastIndex = nums.length - 1;

        if(nums[0] == target) return 0;
        if(nums[nums.length - 1] == target) return nums.length - 1;

        // List<Integer> list = Arrays.asList(nums);
        // boolean isTargetPresent = list.contains(target);
        // if(isTargetPresent == false) return -1;

        int index = findIndexOfTarget(nums, firstIndex, lastIndex, target);
        return index;
    }

    private int findIndexOfTarget(int[] nums, int firstIndex, int lastIndex, int target) {
        if(target == nums[firstIndex]) return firstIndex;
        if(target == nums[lastIndex]) return lastIndex;


        int value = ((lastIndex - firstIndex) / 2);
        if(value == 0) return -1;

        int midIndex = value + firstIndex;
        if(target == nums[midIndex]) return midIndex;

        if(target > nums[midIndex]) firstIndex = midIndex;
        else lastIndex = midIndex;
        return findIndexOfTarget(nums, firstIndex, lastIndex, target);
    }
}
