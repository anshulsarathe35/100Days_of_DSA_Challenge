//Leetcode questio 1642

// class Solution {
//     public int furthestBuilding(int[] heights, int bricks, int ladders) {
//         int i=1;
//         int count = 0;
//         while(i<heights.length){
//             if(heights[i-1] >= heights[i]){
//                 i++;
//                 count++;
//             }else if(heights[i-1] < heights[i]){
//                 if(bricks >= (heights[i] - heights[i-1])){
//                     bricks -= (heights[i] - heights[i-1]);
//                     i++;
//                     count++;
//                 }else if (ladders > 0){
//                     i++;
//                     count++;
//                     ladders--;
//                 }else{
//                     return count;
//                 }
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int temp = heights[i + 1] - heights[i];
            if (temp > 0) {
                que.offer(temp);
                if (que.size() > ladders) {
                    bricks -= que.poll();
                }
                if (bricks < 0) {
                    return i;
                }
            }
        }
        return heights.length - 1;
    }
}