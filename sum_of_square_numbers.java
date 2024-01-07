//Leetcode question 633

class Solution {
    public boolean judgeSquareSum(int c) {
        int i=0;
        int j = (int) Math.sqrt(c);

        while(i<=j){
            long sum = (long) i*i + j*j;//(Math.pow(i,2) + Math.pow(j,2));
            if(sum == c){
                return true;
            }else if (sum > c){
                j--;
            }i++;
        }
        return false;
        // long i=0;
        // long j = (long) Math.sqrt(c);

        // while(i<=j){
        //     long sum = (long) (Math.pow(i,2) + Math.pow(j,2));
        //     if(sum == c){
        //         return true;
        //     }else if (sum > c){
        //         j--;
        //     }i++;
        // }
        // return false;
    }
}