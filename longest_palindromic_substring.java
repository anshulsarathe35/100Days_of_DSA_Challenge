//Leetcode question 5

class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        int len = 0;
        for(int i=0;i<s.length();i++){
            String curVal = func(s, i, i); //for odd length
            if(curVal.length() > len){
                result = curVal;
                len = curVal.length();
            }
            curVal = func(s, i ,i+1);  //for even length
            if(curVal.length() > len){
                result = curVal;
                len = curVal.length();
            }
        }System.gc();
        return result;
    }
    static String func(String str, int start , int end){
        while(start >=0 && end<str.length()){
            if(str.charAt(start) == str.charAt(end)){
                start--;
                end++;
            }else break;
        }
        return str.substring(start+1, end);
    } 
}
