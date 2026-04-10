
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         ListNode current = head;
        if(current == null)
        return current;
        while(current.next!=null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            } 
        }
        return head;
    }
}