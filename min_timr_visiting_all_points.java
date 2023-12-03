//Leetcode question 1266

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int answer = 0;
        for(int i=0;i<points.length-1;i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            int x2 = points[i+1][0];
            int y2 = points[i+1][1];

            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2- y1);
            answer += Math.min(dx, dy) + Math.abs(dy - dx);
        }
        return answer;
    }
}