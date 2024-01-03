//Leetcode question 2125

class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int answer = 0;
        // if(bank.length < 2) return 0;
        for(int i=0;i<bank.length;i++){
            int curr = 0;
            for(char ch: bank[i].toCharArray()){
                if(ch == '1'){
                    curr++;
                }
            }
            answer += (curr * prev);
            if(curr != 0){
                prev = curr;
            }
        }
        return answer;
    }
}