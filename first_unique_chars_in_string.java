//leetcode question 387

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
        
        
        
        
        
        // Map<Character, Integer> map = new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     map.put(s.charAt(i) , map.getOrDefault(s.charAt(i), 0)+1);
        // }
        // System.out.println(map);
//        for(int i=0;i<s.length();i++){
//            if(map.containsKey(s.charAt(i))){
//                if(map.containsValue(1)){
//                    return i;
//                }
//            }
//        }
        // char ch = '#';
        // for(Map.Entry<Character, Integer> e: map.entrySet()){
        //     if(map.containsKey(e.getKey())){
        //         if(e.getValue() == 1){
        //             ch = e.getKey();
        //         }
        //     }
        // }
        // if(ch == '#'){
        //     return -1;
        // }else{
        //     return s.indexOf(ch);
        // }
    }
}