class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let newSet = new Set(nums)

        return nums.length != newSet.size;
    }
}
