//Leetcode question 1630

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> answer= new ArrayList<>();

        for(int i=0;i<l.length;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=l[i];j<=r[i];j++){
                temp.add(nums[j]);
            }
            boolean checking = check_bool(temp);
            answer.add(checking);
        }
        return answer;
    }

    static boolean check_bool(List<Integer> arr){
        Collections.sort(arr);
        for(int i=2;i<arr.size();i++){
            if(arr.get(i) - arr.get(i-1) != arr.get(1) - arr.get(0)){
            return false;
            }
        }
        return true;
    }
}