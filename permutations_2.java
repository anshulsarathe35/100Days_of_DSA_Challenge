//Leetcode question 47

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] freq = new boolean[nums.length];
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        func(nums,ds,ans,freq);
        List<List<Integer>> result = new ArrayList<>(ans);
        return result;

    }
    static void func(int[] nums, List<Integer> ds, Set<List<Integer>> ans , boolean[] freq){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);

                func(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
}