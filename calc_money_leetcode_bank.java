//Leetcode question 1716

class Solution {
    public int totalMoney(int n) {
        int terms = n/7;
        int first_element = 28;
        int last_element = first_element + (terms -1) *7;

        int result = terms *(first_element + last_element) / 2;

        int money = 1+ terms;
        for(int i=1;i<= (n%7);i++){
            result += money;
            money++;
        }
        return result;
    }
}