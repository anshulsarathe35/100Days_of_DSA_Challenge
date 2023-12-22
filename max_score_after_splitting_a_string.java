//Leetcode question 1422

class Solution {
    public int maxScore(String s) {
        int answer=0;
        int i=0;
        int j =1;
        while(j<s.length()){
            int leftCount=0;
            int rightCount = 0;
            String left = s.substring(i, j);
            String right = s.substring(j);
            for(int ind= 0;ind<left.length();ind++){
                if(left.charAt(ind)=='0') leftCount++;
            }
            for(int ind=0;ind<right.length();ind++){
                if(right.charAt(ind)=='1') rightCount++;
            }
            answer= Math.max(answer, leftCount+rightCount);
            j++;
        }
        return answer;
        
    }
}