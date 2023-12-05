//Leetcode question 2264

class Solution {
    public String largestGoodInteger(String num) {
        Set<String> ans = new TreeSet<>();
        for(int i=0;i<num.length()-2;i++){
            int j = i+1;
            int k = j+1;
            if(num.charAt(i)==num.charAt(j) && num.charAt(j)==num.charAt(k)){
                String str = num.substring(i,k+1);
                ans.add(str);
            }
        }
        if(ans.size() == 0){
            return "";
        }
        List<String> temp = new ArrayList<>(ans);
        return temp.get(temp.size()-1);
    }
}