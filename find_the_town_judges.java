//Leetcode question 997

class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1) return n;
        int[] arr = new int[n + 1];
        for (int[] relation : trust) {
            arr[relation[0]]--;
            arr[relation[1]]++;
        }
        for (int i = 1; i <= n; ++i) {
            if (arr[i] == n - 1) {
                return i;
            }
        }
        return -1;
        // if(n==1) return n;
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<trust.length;i++){
        //     map.put(trust[i][0], map.getOrDefault(trust[i][0], 0) +1 );
        // }
        // // System.out.println(map);
        // int count = 0;
        // for(int i=0;i<trust.length;i++){
        //     if(!map.containsKey(trust[i][1])){
        //         // return trust[i][1];
        //         count++;
        //         if(count == map.size()){
        //             return trust[i][1];
        //         }
        //     }
        // }
        // // if(count == map.size()) return 
        // return -1;
        
    }
}