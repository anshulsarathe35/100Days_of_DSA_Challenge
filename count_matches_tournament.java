//Leetcode question 1688

class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        int teamAdvance = n;
        while(teamAdvance >= 1){
            if(n%2 ==0){
                count += n/2;
                teamAdvance -= n/2;
            }else{
                count += (n-1)/2;
                teamAdvance -= ((n-1)/2) + 1;
            }
        }
        if(n%2 ==0) return count -1;
        return count;
    }
}