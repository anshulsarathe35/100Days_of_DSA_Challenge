//Leetcode question 1436

class Solution {
    public String destCity(List<List<String>> paths) {
        //using hashset
        // Set<String> set = new HashSet<>();
        // for(var p: paths){
        //     set.add(p.get(0));
        // }
        // for(var p:paths){
        //     if(!set.contains(p.get(1))){
        //         return p.get(1);
        //     }
        // }
        // return "";

        //using hashmap
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<paths.size();i++){
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        for(String str: map.keySet()){
            if(!map.containsKey(map.get(str))){
                return map.get(str);
            }
        }
        return "";
    }
}