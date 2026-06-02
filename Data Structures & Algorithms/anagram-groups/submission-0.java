class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> out = groupAnagram(strs);
        return out;
    }

    private static List<List<String>> groupAnagram(String[] str) {
        List<String> arr = new ArrayList<>(Arrays.asList(str));
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            char[] ch = arr.get(i).toLowerCase().toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);

            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(arr.get(i));

        }

        return new ArrayList<>(map.values());
    }
}
