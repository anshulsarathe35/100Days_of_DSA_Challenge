//Leetcode question 179

class Solution {
    public String largestNumber(int[] nums) {
        String[] answer = new String[nums.length];         
        for(int i=0; i<nums.length; i++){
            answer[i] = String.valueOf(nums[i]);
        }  
        Arrays.sort(answer, (a,b) -> (b + a).compareTo(a + b));
        return answer[0].equals("0") ? "0" : String.join("",answer);
    }
}

// class Solution {
//     public String largestNumber(int[] nums) {
//         StringBuilder answer = new StringBuilder();
//         int i=0;
//         int j=1;
//         while(j<nums.length){
//             if(nums[i]%10 > nums[j]%10){
//                 swap(nums[i] , nums[j]);
//             }
//             i++;
//             j++;
//         }
//         // System.out.println(Arrays.toString(nums));
//         for(int idx=nums.length-1;idx>=0;idx--){
//             answer.append(nums[idx]);
//         }
//         return answer.toString();
//     }
//     static void swap(int i,int j){
//         int temp = i;
//         i=j;
//         j=temp;
//     }
// }