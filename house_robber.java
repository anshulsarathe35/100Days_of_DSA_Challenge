//Leetcode question 198

class Solution {
    public int rob(int[] nums) {
        int robhouse = 0;
        int adjHouses = 0;
        for (int i = 0; i < nums.length; i++) {
            int newHouse = adjHouses + nums[i];
            int newAdjHouses = Math.max(adjHouses, robhouse);
            robhouse = newHouse;
            adjHouses = newAdjHouses;
        }
        int money = Math.max(robhouse, adjHouses);
        return money;
    }
}