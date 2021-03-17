package LeetCode;

import javax.crypto.Cipher;
import java.util.List;

public class P23_Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        if(lists.length == 0)
            return null;
        ListNode currentNode = head;
        while(!isNull(lists)) {
            int min = Integer.MAX_VALUE;
            int minIdx = 0;
            for (int i = 0; i < lists.length; i++) {
                if(lists[i] != null) {
                    if (min > lists[i].val) {
                        minIdx = i;
                        min = lists[i].val;
                    }
                }
            }
            currentNode.next = lists[minIdx];
            currentNode = currentNode.next;
            if(lists[minIdx]!=null)
                lists[minIdx] = lists[minIdx].next;
            else
                lists[minIdx]=null;
        }
        return head.next;
    }

    boolean isNull(ListNode[] lists) {
        for(ListNode ln : lists) {
            if(ln!=null)
                return false;
        }
        return true;
    }
}


