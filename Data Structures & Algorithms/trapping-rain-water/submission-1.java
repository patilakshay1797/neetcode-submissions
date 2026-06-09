class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftMaxIndex = 0;
        int rightMaxIndex = height.length - 1;
        int area = 0;

        while (l <= r) {
            if (height[l] > height[leftMaxIndex]) {
                leftMaxIndex = l;
            }
            if (height[r] > height[rightMaxIndex]) {
                rightMaxIndex = r;
            }
            if (height[leftMaxIndex] > height[l] && l != r) {
                area += (height[leftMaxIndex] - height[l]);
            }
            if (height[rightMaxIndex] > height[r] && l != r) {
                area += height[rightMaxIndex] - height[r];
            }
            if (l == r) {
                int lowerMax = Math.min(height[leftMaxIndex], height[rightMaxIndex]);
                int remainingArea = lowerMax - height[l];
                if (remainingArea > 0) {
                    area += remainingArea;
                }
            }
            if (height[leftMaxIndex] > height[rightMaxIndex] || height[leftMaxIndex] == height[rightMaxIndex]) {
                r--;
            }
            if (height[leftMaxIndex] < height[rightMaxIndex]) {
                l++;
            }
        }
        return area;
    }
}
