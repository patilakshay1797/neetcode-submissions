class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] arr1 = s.toLowerCase().toCharArray();
        char[] arr2 = t.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedStr1 = Arrays.toString(arr1);
        String sortedStr2 = Arrays.toString(arr2);

        if(sortedStr1.equals(sortedStr2)) {
            return true;
        } else return false;
    }
}
