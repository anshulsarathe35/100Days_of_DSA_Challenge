//Leetcode question 2971

class Solution {
    public long largestPerimeter(int[] nums) {
        if(nums.length < 3){
            return -1;
        }
        Arrays.sort(nums);
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
//        System.out.println(sum);
        for (int i = nums.length - 1; i >= 2; i--) {
            sum -= nums[i];
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }
        return -1;
    }
}