class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        int l = 0;
        int r = 1;
        int currentMax = 1;
        int max = 1;

        while(r < s.length()) {
            String subStr = s.substring(l, r);
            char charAtR = s.charAt(r);
            if(subStr.contains(String.valueOf(charAtR))) {
                l = subStr.indexOf(charAtR) + 1 + l;
                if(l == r) r++;
                currentMax = s.substring(l, r).length();
            }else {
                currentMax++;
                if(currentMax > max) max = currentMax;
                r++;
            }
           
        }
        return max;
    }
}
