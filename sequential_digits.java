//Leetcode question 1291

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=8;i++){
            queue.add(i);
        }

        while(!queue.isEmpty()){
            int num = queue.peek();
            queue.remove();
            if(num <= high && num >= low){
                answer.add(num);
            }
            int lastIndex = num %10;
            if(lastIndex + 1 <= 9){
                queue.add(num*10 + (lastIndex+1));
            }
        }
        return answer; 
    }
}