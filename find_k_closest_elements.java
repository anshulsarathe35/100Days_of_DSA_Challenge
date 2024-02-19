//Leetcode question 658

//done using sliding window approach

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int[] temp = new int[arr.length];
        if(arr.length < k){
            return list;
        }
        for(int i=0;i<arr.length;i++){
            temp[i] = Math.abs(arr[i] - x);
        }
        int sum = 0;
        for(int j=0;j<k;j++){
            sum += temp[j];
        }
        int min = sum;
        int answer = 0;
        for(int i=0;i<arr.length-k;i++){
            sum += temp[k+i] - temp[i];
            if(sum < min && sum != min){
                answer = i+1;
                min = sum;
            }
        }
        for(int i=answer; i<answer+k;i++){
            list.add(arr[i]);
        }
        return list;
    }
}