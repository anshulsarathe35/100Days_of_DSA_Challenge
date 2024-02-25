//Leetcode question 441

class Solution {
    public int arrangeCoins(int n) {
        //Brute - O(N)
        // int stairs = n;
        // int count = 0;
        // int stepCount = 1;
        // while(stairs >= 0){
        //     stairs -= stepCount;
        //     stepCount++;
        //     count++;
        // }
        // return count-1;
        
        //using math - better - O(LogN)
        // return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);

        //using binary search - O(LogN)
        int start = 0;
        int end = n;
        while(start <= end){
            long mid = start +(end-start)/2;
            long coinsUsed = mid * (mid+1)/2;
            if(coinsUsed == n) return (int)(mid);
            else if(coinsUsed > n){
                end = (int)mid-1;
            }else{
                start = (int)mid+1;
            }
        }
        return (int)end;
    }
}