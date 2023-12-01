//Leetcode question 28

//approach 1
    // for(int i=0;i<haystack.length();i++){
    //     if(haystack.contains(needle)){
    //         return haystack.indexOf(needle);
    //     }
    // }
    // return -1;

//approach 2
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length() - needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i, needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}