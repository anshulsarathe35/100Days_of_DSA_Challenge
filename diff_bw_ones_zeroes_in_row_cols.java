//Leetcode question 2482

class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] diff = new int[m][n];
        int[] onesRows = new int[m];
        int[] onesCols = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    onesRows[i]+=1;
                    onesCols[j]+=1;
                }  
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int oneRowi = onesRows[i];
                int oneColj = onesCols[j];
                int zeroRowi = n - oneRowi;
                int zeroColj = m - oneColj;
                diff[i][j] = oneRowi +oneColj - zeroRowi - zeroColj;
            }
        }System.gc();
        return diff;
    }
    
}