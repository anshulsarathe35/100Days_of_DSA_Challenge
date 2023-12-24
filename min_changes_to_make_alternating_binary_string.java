//Leetcode question 1758

//Approach 1
    //     int zeroStart = 0; //starting with 0
    //     int oneStart = 0; //starting with one
    //     for(int i=0;i<s.length();i++){
    //        if(i%2==0){
    //            if(s.charAt(i) == '0'){
    //                oneStart++;
    //            }else{
    //                zeroStart++;
    //            }
    //        }else{
    //            if(s.charAt(i) == '1'){
    //                oneStart++;
    //            }else{
    //                zeroStart++;
    //            }
    //        }
    //    }
    //    return Math.min(oneStart, zeroStart);

//Approach 2
class Solution {
    public int minOperations(String s) {
        int zeroStart = 0; 
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i) == '1'){
                    zeroStart++;
                }
            }else{
                if(s.charAt(i) == '0'){
                    zeroStart++;
                }
            }
        }
        int oneStart=s.length()-zeroStart;
        return Math.min(zeroStart, oneStart);
    }
}