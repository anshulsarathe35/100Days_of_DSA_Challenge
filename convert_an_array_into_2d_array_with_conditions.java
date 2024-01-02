//Leetcode question 2610

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] temp = new int[nums.length+1];
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int i: nums){
            int freq = temp[i];
            if(freq == answer.size()){
                answer.add(new ArrayList<>());
            }
            answer.get(freq).add(i);
            temp[i]++;
        }
        return answer;
    }
}