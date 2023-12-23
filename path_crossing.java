//Leetcode question 1496

class Solution {
    public boolean isPathCrossing(String path) {
        Map<Character, Pair<Integer,Integer>> map = new HashMap<>();
        map.put('N', new Pair(0,1));
        map.put('S', new Pair(0, -1));
        map.put('E', new Pair(1, 0));
        map.put('W', new Pair(-1, 0));

        Set<Pair<Integer, Integer>> visited = new HashSet<>();
        visited.add(new Pair(0,0));

        int x= 0, y=0;
        for(Character ch: path.toCharArray()){
            Pair<Integer, Integer> currPair = map.get(ch);
            int dx = currPair.getKey();
            int dy = currPair.getValue();
            x += dx;
            y += dy;

            Pair<Integer, Integer> pair = new Pair(x,y);
            if(visited.contains(pair)){
                return true;
            }
            visited.add(pair);
        }
        return false;
    }
}