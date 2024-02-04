//Leetcode question 76

class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map  =new HashMap<>();
        if(t.length() > s.length()){
            return "";
        }
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }
        int count = t.length();
        int i=0;
        int j=0;
        int minSize = Integer.MAX_VALUE;
        int startingIdx = 0;
        while(j< s.length()){
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) >= 0) {
                    count--;
                }
            }
            while (count == 0) { // Try to shrink the window
                if (j - i + 1 < minSize) {
                    minSize = j - i + 1;
                    startingIdx = i;
                }

                char temp = s.charAt(i);
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                    if (map.get(temp) > 0) {
                        count++;
                    }
                }
                i++;
            }j++;
        }
        return minSize == Integer.MAX_VALUE ? "" : s.substring( startingIdx, minSize+ startingIdx);
    }
}