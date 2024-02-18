//Leetcode question 506

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        int[] sortedArr = new int[score.length];
        for(int i=0;i<score.length;i++){
            sortedArr[i] = score[i];
        }
        Arrays.sort(sortedArr);
        int cnt = 1;
        for(int i=sortedArr.length-1 ;i>= 0;i--){
            int idx = 0;
            for(int j=0;j<score.length;j++){
                if(score[j] == sortedArr[i]){
                    idx = j;
                    break;
                }
            }
            if(cnt == 1){
                answer[idx] = "Gold Medal";
            }else if(cnt == 2){
                answer[idx] = "Silver Medal";
            }else if (cnt == 3){
                answer[idx] = "Bronze Medal";
            }else{
                answer[idx] = Integer.toString(cnt);
            }
            cnt++;
        }
        return answer;
    }
}