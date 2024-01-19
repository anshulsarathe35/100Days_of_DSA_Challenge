//Leetcode question 168

class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber<27){
            return Character.toString((char) ('A' + (columnNumber-1)));
        }
        StringBuilder ans = new StringBuilder();
        while(columnNumber > 0){
            int temp = columnNumber%26;
            if(temp == 0){
                ans.append('Z');
                columnNumber--;
            }else{
                ans.append((char) ('A' + temp-1));
            }
            columnNumber /= 26;
        }
        return ans.reverse().toString();
    }
}