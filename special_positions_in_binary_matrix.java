//leetcode question 1582

class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int r= mat.length;
        int c = mat[0].length;
        int[] row = new int[r];
        int[] col = new int[c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    row[i]++;
                }
            }
        }
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[j][i] == 0){
                    col[i]++;
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    if(row[i] == c-1 && col[j] == r-1){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}