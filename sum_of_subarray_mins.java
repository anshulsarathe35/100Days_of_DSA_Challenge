//Leetcode question 907

class Solution {
    static int[] getNSL(int[] arr, int n) {
            int[] ans = new int[n];
            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                    st.pop();
                }
                ans[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i);
            }
            return ans;
        }

        static int[] getNSR(int[] arr, int n) {
            int[] ans = new int[n];
            Stack<Integer> st = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                    st.pop();
                }

                ans[i] = st.isEmpty() ? n : st.peek();
                st.push(i);
            }

            return ans;
        }

        static int sumSubarrayMins(int[] arr) {
            int n = arr.length;

            int[] NSL = getNSL(arr, n);
            int[] NSR = getNSR(arr, n);

            long sum = 0;
            int M = 1000000007;

            for (int i = 0; i < n; i++) {
                long d1 = i - NSL[i];
                long d2 = NSR[i] - i;

                long totalWaysForIMin = d1 * d2;
                long sumIInTotalWays = arr[i] * totalWaysForIMin;

                sum = (sum + sumIInTotalWays) % M;
            }

            return (int) sum;
        }
}