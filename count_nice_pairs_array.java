//Leetcode question 1814

class Solution {
    public int countNicePairs(int[] nums) {
        Map<Long, Integer> map = new HashMap<>();
        int count = 0;
        int mod = (int) (1E9+7);  // for 10^9 + 7

        for(int i = 0;i<nums.length;i++){
            long curr_rev_val = rev(nums[i]);
            long diff = nums[i] - curr_rev_val;

            if(map.containsKey(diff)){
                count = (count + map.get(diff)) % mod;
            }
            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }
        return count;

    }

    static int rev(int num){
        int reverse = 0;
        while (num != 0){
            int rem = num %10;
            reverse = (reverse *10) + rem;
            num = num /10;
        }
        return reverse;
    }
}