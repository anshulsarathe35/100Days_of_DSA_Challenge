//Leetcode question 71
//this question can be done with Stack and ArrayList

import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        //using stack
        Stack<String> stack = new Stack<>();
        StringTokenizer token = new StringTokenizer(path, "/");

        while(token.hasMoreTokens()){
            String s = token.nextToken();
            if(s.equals(".") || s.equals(" ")){
                continue;
            }
            else if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(s);
            }
        }
        if(stack.isEmpty()) return "/";
        String result = "";
        for(String str: stack){
            result += "/"+str;
        }
        return result;
    }
}