//Leetcode question 402

class Solution {
    public String removeKdigits(String num, int k) {
        if(k >= num.length()) return "0";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<num.length();i++){
            if(stack.isEmpty()){
                stack.push(num.charAt(i));
            }else{
                while(!stack.isEmpty() && stack.peek() > num.charAt(i) && k>0){
                    stack.pop();
                    k--;
                }
                stack.push(num.charAt(i));
            }
        }
        while(k>0){
            stack.pop();
            k--;
        }
        if(stack.isEmpty()) return "0";

        String ans = "";
        while(!stack.isEmpty()){
            ans = stack.peek()+ans;
            stack.pop();
        }

        int i=0;
        while (i < ans.length() && ans.charAt(i) == '0') {
            i += 1;
        }

        return (ans.substring(i) == "")? "0": ans.substring(i);
    }
}