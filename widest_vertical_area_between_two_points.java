//Leetcode question 1637

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<points.length;i++){
            st.add(points[i][0]);
        }
        int[] arr=  new int[st.size()];
        int i = 0;
        for(int x: st){
            arr[i++] = x;
        }
        Arrays.sort(arr);
        int a= 0;
        int b= 1;
        int maxDiff = 0;
        while(b<arr.length){
            int temp = arr[b] - arr[a];
            maxDiff = Math.max(maxDiff, temp);
            a++;
            b++;
        }
        return maxDiff;
    }
}