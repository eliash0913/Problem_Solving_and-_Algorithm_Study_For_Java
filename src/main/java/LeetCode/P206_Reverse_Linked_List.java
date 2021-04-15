package LeetCode;

public class P206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode previousNode=null;
        ListNode currentNode=head;
        while(currentNode!=null) {
            ListNode temp = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = temp;
        }
        return previousNode;
    }


//    public ListNode reverseList(ListNode head) {
//        ListNode previousNode = null;
//        ListNode currentNode = head;
//        while(currentNode!=null){
//            ListNode nextTemp = currentNode.next; //nextTemp = 2 //3
//            currentNode.next = previousNode; //cn = null // 1
//            previousNode = currentNode; //pn = 1 //pn = 2
//            currentNode = nextTemp; //cn = 2 // cn = 3
//        }
//        return previousNode;
//    }
//
//    public ListNode rReverseList(ListNode head) {
//        if(head==null || head.next==null) return head;
//        ListNode previousNode = rReverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return previousNode;
//    }
}
