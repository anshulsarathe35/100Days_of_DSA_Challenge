//Leetcode question 16

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        int minDiff = Integer.MAX_VALUE;

        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length- 1;

            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
                int diffTarget = Math.abs(sum - target);
                if(diffTarget< minDiff){
                    result = sum;
                    minDiff = diffTarget;
                }
            }
        }
        return result;
    }
}