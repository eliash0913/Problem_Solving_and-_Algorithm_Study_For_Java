package LeetCode_Mock_Interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    AddTwoNumbers atn = new AddTwoNumbers();
    @Test
    void addTwoNumbers() {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);

        ListNode head3 = new ListNode(7);
        head3.next = new ListNode(0);
        head3.next.next = new ListNode(8);

        atn.addTwoNumbers(head1, head2);

        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(8);

        ListNode head5 = new ListNode(0);

        atn.addTwoNumbers(head4, head5);
    }
}