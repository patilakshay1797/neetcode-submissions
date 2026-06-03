class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // TODO: Implement the logic to find the top k
        // frequent elements in the array.
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int num : nums) {
            map.computeIfAbsent(num, k1 -> new ArrayList<>()).add(num);
        }

        // System.out.println(map);
        // Sort the map by frequency in descending order
        Set<Map.Entry<Integer, List<Integer>>> str = map.entrySet();
        // List<List<String>> = str.
        List<List<Integer>> sortedList = new ArrayList(map.values());
        sortedList.sort((a, b) -> {
            if (a.size() > b.size()) {
                return -1;
            } else if (a.size() < b.size()) {
                return 1;
            } else {
                return 0;
            }
        });
        // System.out.println(sortedList);

        int[] retArr = new int[k];
        for (int i = 0; i < k; i++) {
            retArr[i] = sortedList.get(i).get(0);
        }
        // Extract the top k elements from the sorted map

        return retArr;
    }
}
