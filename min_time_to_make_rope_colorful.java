//Leetcode question 1578

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int answer = 0;
        int prev = 0;
        for(int i=0;i<colors.length();i++){
            if(i>0 && colors.charAt(i) != colors.charAt(i-1)){
                prev=0;
            }
            int currInd = neededTime[i];
            answer += Math.min(prev, currInd);
            prev = Math.max(prev, currInd);
        }
        return answer;
        // int answer = 0;
        // int i=0;
        // int j= 1;
        // while(j<colors.length()){
        //     if(colors.charAt(i) == colors.charAt(j)){
        //         answer += Math.min(neededTime[i] , neededTime[j]);
        //     }
        //     i++;
        //     j++;
        // }
        // return answer;
    }
}