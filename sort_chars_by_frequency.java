//Leetcode question 451

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        TreeMap<Integer, List<Character>> treeMap = new TreeMap<>(Collections.reverseOrder());
        StringBuilder answer = new StringBuilder();

        for (char a : s.toCharArray())
            map.put(a, map.getOrDefault(a, 0) + 1);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (!treeMap.containsKey(entry.getValue())) {
                treeMap.put(entry.getValue(), new ArrayList<>());
            }
            treeMap.get(entry.getValue()).add(entry.getKey());
        }

        for (Map.Entry<Integer, List<Character>> entry : treeMap.entrySet()) {
            int freq = entry.getKey();
            List<Character> chars = entry.getValue();
            for (char c : chars) {
                for (int i = 0; i < freq; i++) {
                    answer.append(c);
                }
            }
        }

        return answer.toString();
    }
}


