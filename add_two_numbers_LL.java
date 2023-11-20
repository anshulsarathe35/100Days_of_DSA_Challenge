//leetcode question 2

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode temp = new ListNode(0);
        ListNode testing = temp;
        int carry = 0;

        while(n1!=null || n2!=null){
            int x = (n1!=null) ? n1.val : 0;
            int y = (n2!=null) ? n2.val : 0;
            int sum = x+y+carry;
            carry = sum/10;
            testing.next = new ListNode(sum%10);
            testing = testing.next;
            if(n1!=null){
                n1= n1.next;
            }if(n2!=null){
                n2 = n2.next;
            }
        }
        if(carry>0){
            testing.next = new ListNode(carry);
        }
    
        return temp.next;    
}}