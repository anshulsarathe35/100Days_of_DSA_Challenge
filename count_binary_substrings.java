//Leetcode question 696

class Solution {
    public int countBinarySubstrings(String s) {
        int answer = 0;
        int count = 1;
        int prevCount = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                answer += Math.min(count, prevCount);
                prevCount = count;
                count = 1;
            }
        }
        return answer + Math.min(count, prevCount);
    }
}