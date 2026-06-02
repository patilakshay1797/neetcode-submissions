class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length) return false;
        const firstStr = s.split("").sort().join("")
        const secondStr = t.split("").sort().join("")

        return firstStr === secondStr ? true : false;
    }
}
