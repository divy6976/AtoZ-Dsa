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
    public void reorderList(ListNode head) {

        ArrayList<Integer> ans=new ArrayList<>();

        ListNode temp=head;

        while(temp !=null){
  ans.add(temp.val);
            temp=temp.next;
        }
     int i=0;
     int j=ans.size()-1;
     ArrayList<Integer> create=new ArrayList<>();
     while(i<=j){
        create.add(ans.get(i));
        create.add(ans.get(j));
        i++;
        j--;
     }      

  temp=head;
int k=0;
  while(temp!=null){
    temp.val=create.get(k);
    k++;
    temp=temp.next;
  }


    }
}