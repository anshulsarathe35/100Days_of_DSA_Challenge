//Leetcode question 643

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double answer = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        int largestSum = sum;
        for(int i =k;i<nums.length;i++){
            sum += nums[i] - nums[i-k];
            largestSum = Math.max(largestSum, sum);
        }
        answer = (double) largestSum/k;
        return answer;
    }
}