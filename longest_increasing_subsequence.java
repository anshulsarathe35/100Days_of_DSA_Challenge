//Leetcode question 300
//solved using Binary search including an auxiliary space
//can also be done using DP

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
         int answer = 0;
         for(int i=0;i<nums.length;i++){
             int start = 0;
             int end = answer;
             while(start != end){
                 int mid = start + (end-start)/2;
                 if(arr[mid] < nums[i]){
                     start = mid+1;
                 }else{
                     end = mid;
                 }
             }
             arr[start] = nums[i];
             if(start == answer){
                 ++answer;
             }
         }
         return answer;
    }
}