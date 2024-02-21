//Leetcode question 2269

class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String str = Integer.toString(num);
        int start = 0;
        int end = k;
        while(end <= str.length()){
            if(isDivisor(str.substring(start, end), num)){
                count++;
            }
            start++;
            end++;
        }
        return count;
    }
    static boolean isDivisor(String str, int num){
        int n=Integer.parseInt(str);
       if (n != 0) {
            return num % n == 0;
        } else {
            return false;
        }

    }
}