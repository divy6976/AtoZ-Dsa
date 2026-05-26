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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp=head;

      
        ListNode prev =null;

        int cnt=0;

        while(temp!=null){
            cnt ++;
            temp=temp.next;
        }

        temp=head;

        int delete=cnt-n;

        if(delete == 0){
           return head.next;
        }
       
 int res=0;
        while(temp != null){


            if(res == delete){
                prev.next=temp.next;
                temp.next= null;
                break;
            }
       


   prev=temp;
        temp=temp.next;
        res++;
        

        }

        return head;

        
    }
}