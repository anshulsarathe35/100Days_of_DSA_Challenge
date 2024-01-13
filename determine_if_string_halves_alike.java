//Leetcode question 1704

class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String str1 = s.substring(0,n/2);
        String str2 = s.substring(n/2,n);                       
        int vowelCount1 = 0;
        int vowelCount2 = 0;
        for(char ch: str1.toLowerCase().toCharArray()){
            if(isVowel(ch)){
                vowelCount1++;
            }
        }
        for(char ch: str2.toLowerCase().toCharArray()){
            if(isVowel(ch)){
                vowelCount2++;
            }
        }
        
        if(vowelCount1==vowelCount2) return true;
        return false;
    }
    static boolean isVowel(char ch){
        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
            return true;
        }
        return false;
    }
}