//Leetcode question 8

class Solution {
    public int myAtoi(String str) {
        int sign = 1;
        int result = 0;
        int i=0;
        while(i<str.length() && str.charAt(i)== ' '){
            i++;
        }
        if(i<str.length() && str.charAt(i)=='+'){
            sign=1;
            i++;
        }else if(i<str.length() && str.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        while(i<str.length() && 0<=(int) str.charAt(i)-'0' && (int) str.charAt(i)-'0'<=9){
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && (int)(str.charAt(i)-'0')>Integer.MAX_VALUE%10)){
                result = sign==1?Integer.MAX_VALUE : Integer.MIN_VALUE;
                return result;
            }
            result = result *10;
            result += (int) str.charAt(i) - '0';
            i++;
        }
        return result*sign;
    }
}