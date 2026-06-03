class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // TODO: Implement the logic to find the top k
        // frequent elements in the array.
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int num : nums) {
            map.computeIfAbsent(num, k1 -> new ArrayList<>()).add(num);
        }

        // Sort the map by frequency in descending order
        List<List<Integer>> sortedList = new ArrayList<>(map.values());
        sortedList.sort((a, b) -> {
            if (a.size() > b.size()) {
                return -1;
            } else if (a.size() < b.size()) {
                return 1;
            } else {
                return 0;
            }
        });

        int[] retArr = new int[k];
        for (int i = 0; i < k; i++) {
            retArr[i] = sortedList.get(i).get(0);
        }
        return retArr;
    }
}
