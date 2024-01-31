//Leetcode question 739

class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] answer = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                answer[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return answer;
    }
}