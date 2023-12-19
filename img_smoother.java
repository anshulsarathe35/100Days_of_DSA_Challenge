//Leetcode question 661

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j] = smootherFunc(img, i, j);
            }
        }System.gc();
        return result;
    }

    static int smootherFunc(int[][] arr, int x, int y){
        int count=0;
        int ans= 0;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                int nx= x+i;
                int ny = y+j;
                if(nx<0 || nx>=arr.length || ny<0 || ny>=arr[0].length){
                    continue;
                }
                ans += arr[nx][ny];
                count +=1;
            }
        }
        return ans/count; 
    }
}