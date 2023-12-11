//Leetcode 1287

class Solution {
    public int findSpecialInteger(int[] arr) {
        int twentyFivePer = arr.length/4;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
           map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
           if(e.getValue()> twentyFivePer){
               return e.getKey();
           }
        }
        return 0;
    }
}