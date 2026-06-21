class Solution {
    public boolean isPalindrome(String s) {
        // two pointers solution
        int l = 0;
        int r = s.length() - 1;

        while(l < r) {
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while(r>l &&!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            System.out.println(s.charAt(l) + " ------ " + s.charAt(r));
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            l++;
            r--;
        }
        return true;
    }
}
