//Leetcode 2870
//Daily streak question

//solved using simple greedy approach by adding ceil of a freq/3

class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            double freq = e.getValue();
            if(freq == 1) return -1;
            count += Math.ceil(freq/3);
        }
        return count;
    }
}