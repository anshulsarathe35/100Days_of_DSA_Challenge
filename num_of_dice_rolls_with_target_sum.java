//Leetcode question 1155

class Solution {
    public int numRollsToTarget(int n,int k,int target){
        int modulus = (int) (1e9+7);
        int[]prev=new int[target +1];
        prev[0]=1;
        while(n-->0){
            int[]cur=new int[target +1];
            for(int i=1;i<=k;++i)
                for(int j=i;j<=target;++j){
                cur[j]+=prev[j-i];
                cur[j]%=modulus;
            }
            prev=cur;
            }
            return prev[target];
        }
}