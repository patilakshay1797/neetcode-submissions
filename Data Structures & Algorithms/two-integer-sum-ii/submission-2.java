class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        boolean isFound = false;
        for(int i = 0; i < numbers.length - 1; i++) {
            int first = numbers[i];
            for(int j = i+1; j < numbers.length; j++) {
                int sum = first + numbers[j];
                System.out.println(sum);
                if(sum == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    isFound = true;
                    break;
                }
            }
            if(isFound) {
                System.out.println("Found.....");
                break;
            }
        }
        return result;
    }
}
