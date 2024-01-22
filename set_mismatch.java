//leetcode question 645

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swapElements(nums, i, correct);
            }else{
                i++;
            }
        }
        for(int index= 0; index<nums.length;index++){
            if(nums[index] != index+1){
                answer[0] = nums[index];
                answer[1] = index+1;
            }
        }
        return answer;
    }

    static void swapElements(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}