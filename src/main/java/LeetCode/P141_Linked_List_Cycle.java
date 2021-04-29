package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class P141_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode node1 = head;
        ListNode node2 = head;
        while(node2.next!=null && node2.next.next!=null){
            node1 = node1.next;
            node2 = node2.next.next;
            if(node1==node2) return true;
        }
        return false;
    }
//    public boolean hasCycle(ListNode head) {
//        if(head==null)
//            return false;
//        Set<ListNode> set = new HashSet<>();
//        ListNode current = head;
//        while(current.next!=null){
//            if(set.contains(current))
//                return true;
//            else
//                set.add(current);
//            current = current.next;
//        }
//        return false;
//    }
}
