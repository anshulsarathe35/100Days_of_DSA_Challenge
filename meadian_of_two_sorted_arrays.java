//Leetcode question 4

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double answer = 0;
        int[] temp = new int[nums1.length+ nums2.length];
        int index=0;

        for(int i=0;i<nums1.length;i++){
            temp[index] = nums1[i];
            index++;
        }

        for(int i=0;i<nums2.length;i++){
            temp[index] = nums2[i];
            index++;
        }
        Arrays.sort(temp);
            int median = temp.length%2;
            if(median == 0){
                answer = (temp[temp.length/2] + temp[(temp.length/2)-1])/2f;
            }
            if(median == 1){
                answer = temp[temp.length/2];
            }
        return answer;
    }
}