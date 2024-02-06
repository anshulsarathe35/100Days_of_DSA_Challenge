//Leetcode question 821

class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        char[] arr = s.toCharArray();
        int i = -1;
        int last = -10000;
        
        for(int j = 0; j<s.length(); j++){
            while(arr[j] == c && i<j){
                i++;
                ans[i] = Math.min(Math.abs(i-last), Math.abs(j-i));
                if(i == j){
                    last = j;
                }
            }
        }

        for(;i<s.length(); i++){
            ans[i] = Math.abs(i-last);
        }
        return ans;
    }
}