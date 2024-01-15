//Leetcode question 2225

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            map.put(matches[i][1], map.getOrDefault(matches[i][1], 0)+1);
        }
        Set<Integer> winners = new HashSet<>();
        Set<Integer> losers = new HashSet<>();
        for(int row=0;row<matches.length;row++){
            if(!map.containsKey(matches[row][0])){
                winners.add(matches[row][0]);
            }
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue().equals(1)){
                losers.add(e.getKey());
            }
        }
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(winners);
        Collections.sort(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(losers);
        Collections.sort(list2);
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(list1));
        answer.add(new ArrayList<>(list2));
        return answer;
    }
}