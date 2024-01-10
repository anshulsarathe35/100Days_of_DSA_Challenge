//Leetcode question 2

class Solution {
    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int i=0;
        while(i<str.length){
            int j= Math.min(i+k-1, str.length-1);
            reverseFunc(str, i, j);
            i=i+2*k;
        }
        return new String(str);
    }
    static void reverseFunc(char[] str, int i, int j){
        while(i<j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}