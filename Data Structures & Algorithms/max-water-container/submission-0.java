class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;

        while(l < r) {
            if(l == 0 & r == heights.length - 1) {
                max = Math.min(heights[l], heights[r]) * (r - l);
            }else {
                max = Math.max(max, Math.min(heights[l], heights[r]) * (r - l));
            }
            if(heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
