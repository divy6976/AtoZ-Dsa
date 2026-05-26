/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return head;
        }

        Stack<Integer> st=new Stack<>();

        ListNode temp=head;

        while(temp != null){
            
             st.add(temp.val);
             temp=temp.next;

        }
        ListNode res=null;
if(st.isEmpty()){
    return res;
}
        temp=head;
        while(temp!=null){
            temp.val=st.pop();
            temp=temp.next;
        }

        return head;
        
    }
}