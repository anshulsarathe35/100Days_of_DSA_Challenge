//Leetcode question 1481

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((i,j) -> i.getValue() - j.getValue());
        int count = k;
        for (Map.Entry<Integer, Integer> e: list){
            if(e.getValue() <= count){
                count -= e.getValue();
                map.remove(e.getKey());
            }else{
                break;
            }
        }
        return map.size();
    }
}   