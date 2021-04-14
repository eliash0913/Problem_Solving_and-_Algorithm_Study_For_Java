package LeetCode;

public class P203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        while(head.val==val){
            if(head.next!=null)
                head = head.next;
            else
                return null;
        }
        ListNode current = head;
        while(current.next!=null){
            if (current.next.val == val) {
                if (current.next.next != null)
                    current.next = current.next.next;
                else
                    current.next = null;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
