//Leetcode question 49

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String temp = getFreqString(str);
            if(map.containsKey(temp)){
                map.get(temp).add(str);
            }else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(temp, strList);
            }
        }
        return new ArrayList<>(map.values());


    }
    static String getFreqString(String str){
        int[] freq = new int[26];

        for(char ch: str.toCharArray()){
            freq[ch - 'a']++;
        }
        StringBuilder freqString = new StringBuilder("");
        char ch = 'a';
        for(int i: freq){
            freqString.append(ch);
            freqString.append(i);
            ch++;
        }
        return freqString.toString();
    }
}