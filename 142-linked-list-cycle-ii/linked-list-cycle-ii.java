/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        boolean check=false;

        if(head == null || head.next == null){
            return null;
        }

        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;

        while(fast!=null && fast.next!=null && fast.next.next!=null){

            prev=fast;
            fast=fast.next.next;
            slow=slow.next;

            if(fast == slow){
                check = true;
                break;
               
               

            }

        }
        ListNode temp= head;


        if(check){
        while(temp!=null){
            
            if(temp == slow ){
                return temp;
            }
            temp=temp.next;
            slow=slow.next;
        }
        }



       
        return null;
        
    }
}