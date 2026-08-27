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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> ans=new ArrayList<>();

    
      ListNode temp1=list1;
      ListNode temp2=list2;


      while(temp1 != null && temp2!=null){
        if(temp1.val <= temp2.val){
            ans.add(temp1.val);
            temp1=temp1.next;
      }else {
        ans.add(temp2.val);
        temp2=temp2.next;
      }

      }
     while(temp1 != null){
        ans.add(temp1.val);
        temp1=temp1.next;
     }
     while(temp2!=null){
        ans.add(temp2.val);
        temp2=temp2.next;
     }
          
ListNode head=null;
ListNode tail=null;
for(int i=0;i<ans.size();i++){
    ListNode newNode=new ListNode(ans.get(i));
    if(head == null){
        head= tail = newNode;
    }else {
        tail.next=newNode;
        tail=newNode;
    }
}
return head;
    }
}