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

        int target=cnt-n;
        target=target;
        if(target == 0){
            return head.next;
        }

        ListNode prev=null;
        temp=head;
int check=0;
        while(temp!=null){

            if(check == target){
                prev.next=temp.next;
                temp.next=null;
               break;
            }
            
            prev=temp;
            check ++;
            temp=temp.next;
        }


        return head;


        
    }
}