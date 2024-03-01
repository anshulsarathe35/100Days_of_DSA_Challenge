//Leetcode question 2864

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int countOne = 0;
        int countZero = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1') countOne++;
            else countZero++;
        }
        StringBuilder answer = new StringBuilder();
        answer.append("1".repeat(countOne-1));
        answer.append("0".repeat(countZero));
        answer.append("1");
        return answer.toString();
    }
}

