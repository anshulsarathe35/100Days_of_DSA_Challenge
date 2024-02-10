//Leetcode question 647

class Solution {
    public int countSubstrings(String s) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String temp = s.substring(i, j+1);
                if(isPalindrome(temp)){
                    list.add(temp);
                }
            }
        }
        return list.size();
    }

    static boolean isPalindrome(String temp){
        int i=0;
        int j=temp.length()-1;
        while(i < j){
            if(temp.charAt(i) == temp.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}