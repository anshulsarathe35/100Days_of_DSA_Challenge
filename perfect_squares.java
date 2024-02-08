//leetcode question 279

class Solution {
    public int numSquares(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[0] = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j*j<=i;j++){
                arr[i] = Math.min(arr[i], 1+ arr[i-j*j]);
            }
        }
        return arr[n];
    }
}