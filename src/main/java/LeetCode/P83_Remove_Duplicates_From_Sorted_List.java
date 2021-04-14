package LeetCode;

public class P83_Remove_Duplicates_From_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode currentNode = head;
        while(currentNode.next!=null){
            if(currentNode.val == currentNode.next.val){
                if(currentNode.next.next!=null){
                    currentNode.next = currentNode.next.next;
                } else {
                    currentNode.next = null;
                    break;
                }
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
