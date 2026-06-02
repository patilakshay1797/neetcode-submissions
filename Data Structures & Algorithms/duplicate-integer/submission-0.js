class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let newSet = new Set()
        nums.forEach(num => {
            newSet.add(num);
        })

        return nums.length != newSet.size;
    }
}
