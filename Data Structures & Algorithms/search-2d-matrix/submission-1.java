class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean isTargetPresent = false;
        for(int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][0]);
            if(Arrays.binarySearch(matrix[i], target) > -1) {
                isTargetPresent = true;
                break;
            }
        }
        return isTargetPresent;
    }
}
