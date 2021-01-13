package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P23_Merge_k_Sorted_ListsTest {
    @Test
    void Test1() {
        P23_Merge_k_Sorted_Lists p23 = new P23_Merge_k_Sorted_Lists();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next = new ListNode(6);

        ListNode sample1 = new ListNode(1);
        sample1.next = new ListNode(4);
        sample1.next.next = new ListNode(5);

        ListNode sample2 = new ListNode(1);
        sample2.next = new ListNode(3);
        sample2.next.next = new ListNode(4);

        ListNode sample3 = new ListNode(2);
        sample3.next = new ListNode(6);


        ListNode[] samples = {sample1, sample2, sample3};
        ListNode expected = head;
        ListNode actual = p23.mergeKLists(samples);

        assertEquals(expected.val, actual.val);
        while(expected.next!=null && actual.next!=null) {
            expected = expected.next;
            actual = actual.next;
            assertEquals(expected.val, actual.val);
        }
    }
}