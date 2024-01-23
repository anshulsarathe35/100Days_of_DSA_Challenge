//Leetcode question 1239

class Solution {
    public int maxLength(List<String> arr) {
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        int answer = 0;
        for (String s : arr) {
            int a = 0, dup = 0;
            for (char c : s.toCharArray()) {
                dup |= a & (1 << (c - 'a'));
                a |= 1 << (c - 'a');
            }
            if (dup > 0)    continue;
            for (int i = temp.size() - 1; i >= 0; i--) {
                if ((temp.get(i) & a) > 0) continue;
                temp.add(temp.get(i) | a);
                answer = Math.max(answer, Integer.bitCount(temp.get(i) | a));
            }
        }
        return answer;
    }
}