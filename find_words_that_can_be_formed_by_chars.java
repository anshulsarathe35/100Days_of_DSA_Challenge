//Leetcode question 1160

class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        boolean isValid = true;

        int[] letters = new int[26];
        for(int i=0;i<chars.length();i++)
            letters[chars.charAt(i)-'a']++;
        int[] temp = letters.clone();
        
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(letters[words[i].charAt(j)-'a'] == 0){
                    isValid = false;
                    break;
                }letters[words[i].charAt(j) - 'a']--;
            }
            if(isValid){
                count += words[i].length();  
            }
            isValid = true;
            letters = temp.clone();
        }
        // System.out.println(count);
        return count;
}}