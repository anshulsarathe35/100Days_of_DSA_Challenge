//Leetcode question 18

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = nums.length-1;
                while(k<l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum == target){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        answer.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }else if(sum < target) k++;
                    else l--;
                }
            }
        }
        return answer;
    }
}