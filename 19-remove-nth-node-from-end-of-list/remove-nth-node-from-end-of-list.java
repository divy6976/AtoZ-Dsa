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
        int cnt=0;

        ListNode temp=head;

        while(temp!=null){
            cnt ++;
            temp=temp.next;
        }

     
  cnt= cnt -n;

     if(cnt == 0){
        return head.next;
     }
     int check=0;
     ListNode prev= null;
     temp=head;
     while(check != cnt){
prev=temp;
temp=temp.next;
check ++;
     }

     prev.next=temp.next;
     temp.next=null;
     return head;
      

        
    }
}