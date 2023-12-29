//Leetcode question 219

//we used set to store values which return false if the length is same , we have done this because if the set does not contains
// duplicates so if the len matches, this means ther is no duplicates which deny the question as it requires num[i] == num[j] which is not possible

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(nums.length == set.size()) return false;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    if(Math.abs(i-j) <= k){
                        return true;
                    }else{
                        break;
                    }
                }
            }
        }
        return false;
    }
}