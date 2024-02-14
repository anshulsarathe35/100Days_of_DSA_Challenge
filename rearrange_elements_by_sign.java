//leetcode question 2149

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positiveNum = new int[nums.length/2];
        int[] negativeNum = new int[nums.length/2];
        int idex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                positiveNum[idex] = nums[i];
                idex++;
            }
        }
        idex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                negativeNum[idex] = nums[i];
                idex++;
            }
        }
        int i=0;
        int j=0;
        int[] answer = new int[nums.length];
        int idx=0;
        while(i<positiveNum.length || j< negativeNum.length){
            if(idx%2 == 0){
                answer[idx] = positiveNum[i];
                i++;
            }else{
                answer[idx] = negativeNum[j];
                j++;
            }idx++;
        }
        return answer;
    }
}