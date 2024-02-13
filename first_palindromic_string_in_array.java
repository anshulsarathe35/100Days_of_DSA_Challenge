//Leetcode question 2108

class Solution {
    public String firstPalindrome(String[] words) {
        //brute sol
        // for(String str : words){
        //     StringBuilder temp = new StringBuilder(str).reverse();
        //     // String comp = temp.reverse().toString();
        //     if(str.equals(temp.toString())){
        //         return str;
        //     }
        // }
        // return "";
        
        //optimised
        for(String str: words){
            if(isPalin(str)){
                return str;
            }
        }
        return "";
    }

    static boolean isPalin(String str){
        int i=0;
        int j=str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}