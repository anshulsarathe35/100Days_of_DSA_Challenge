//Leetcode question 349

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            ans.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(ans.contains(nums2[i])){
                result.add(nums2[i]);
                ans.remove(nums2[i]);
            }
        }
        int[] arr = new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i] = result.get(i);
        }
        return arr;
        
    }
}