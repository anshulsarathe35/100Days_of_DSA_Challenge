//Leetcode question 1657

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for(int i=0;i<word1.length();i++) f1[word1.charAt(i)- 'a']++;
        for(int i=0;i<word2.length();i++) f2[word2.charAt(i)- 'a']++;
        int i=0;
        while(i<26){
            if((f1[i]>0 && f2[i]==0) || (f2[i]>0 && f1[i]==0)){
                return false;
            }
            i++;
        }
        Arrays.sort(f1);
        Arrays.sort(f2);
        i=0;
        while(i<26){
            if(f1[i] != f2[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}