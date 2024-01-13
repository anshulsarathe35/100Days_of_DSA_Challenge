//Leetcode question 1347
// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/

class Solution {
    public int minSteps(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int i=0;
        while(i<s.length()){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
            i++;
        }i=0;
        while(i<t.length()){
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
            i++;
        }
        int count = 0;
        // System.out.println(map1);
        // System.out.println(map2);
        for (int ind = 0; ind < s.length(); ++ind) {
            if (map2.containsKey(s.charAt(ind)) && map1.get(s.charAt(ind)) > map2.get(s.charAt(ind))) {
                count += (map1.get(s.charAt(ind)) - map2.get(s.charAt(ind)));
                map1.put(s.charAt(ind), 0);
            } else if (!map2.containsKey(s.charAt(ind))) {
                ++count;
            }
        }
        return count;
    }
}