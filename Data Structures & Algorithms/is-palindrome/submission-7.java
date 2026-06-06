class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder strBuild = new StringBuilder(s);
        strBuild.reverse();
        String reversedStr = new String(strBuild);
        String newRS = String.join("", reversedStr.split(" ")).replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String originalStr = String.join("", s.split(" ")).replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        System.out.println(originalStr);
        if(newRS.equals(originalStr)) return true;
        return false;
    }
}
