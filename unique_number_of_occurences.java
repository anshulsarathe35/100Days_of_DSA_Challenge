//Leetcode question 1207

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer ,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            set.add(e.getValue());
        }
        if(set.size() == map.size()) return true;
        return false;
    }
}