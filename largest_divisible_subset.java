//leetcode question 368

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] temp = new int[nums.length];
        Arrays.fill(temp, 1);
        int[] prevIdx = new int[nums.length];
        Arrays.fill(prevIdx, -1);
        int lastIdx = 0;
        int maxLength = 1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i] % nums[j] == 0){
                    if(temp[i] < temp[j] +1){
                        temp[i] = temp[j] + 1;
                        prevIdx[i] = j;
                    }
                    if(temp[i] > maxLength){
                        maxLength = temp[i];
                        lastIdx = i;
                    }
                }
            }
        }
        List<Integer> answer = new ArrayList<>();
        while(lastIdx != -1){
            answer.add(nums[lastIdx]);
            lastIdx = prevIdx[lastIdx];
        }
        return answer;
    }
}