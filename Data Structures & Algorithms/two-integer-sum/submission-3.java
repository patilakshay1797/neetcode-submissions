class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int remainingValue = target - nums[i];

           int remainingIndex = list.indexOf(remainingValue);
            if (i == remainingIndex) {
                continue;
            } else if (remainingIndex >= 0) {
                if (i < remainingIndex) {
                    result[0] = i;
                    result[1] = remainingIndex;
                } else {
                    result[0] = remainingIndex;
                    result[1] = i;
                }
                break;
            }

        }
        return result;
    }
}
