package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P206_Reverse_Linked_ListTest {
    P206_Reverse_Linked_List p206 = new P206_Reverse_Linked_List();

    @Test
    void test1(){
        ListNode inputHead = new ListNode(1);
        inputHead.next = new ListNode(2);
        inputHead.next.next = new ListNode(3);
        inputHead.next.next.next = new ListNode(4);
        inputHead.next.next.next.next = new ListNode(5);

        ListNode expectedHead = new ListNode(5);
        expectedHead.next = new ListNode(4);
        expectedHead.next.next = new ListNode(3);
        expectedHead.next.next.next = new ListNode(2);
        expectedHead.next.next.next.next = new ListNode(1);

        ListNode currentActual = p206.reverseList(inputHead);
        ListNode currentExpect = expectedHead;

        ArrayList<Integer> expectedAL = new ArrayList<>();
        ArrayList<Integer> actualAL = new ArrayList<>();
        while(currentExpect.next!=null){
            expectedAL.add(currentExpect.val);
            currentExpect = currentExpect.next;
            actualAL.add(currentActual.val);
            currentActual = currentActual.next;
        }

        assertIterableEquals(expectedAL,actualAL);
    }

    @Test
    void test2(){
        ListNode inputHead = new ListNode(1);
        inputHead.next = new ListNode(2);
        inputHead.next.next = new ListNode(3);
        inputHead.next.next.next = new ListNode(4);
        inputHead.next.next.next.next = new ListNode(5);

        ListNode expectedHead = new ListNode(5);
        expectedHead.next = new ListNode(4);
        expectedHead.next.next = new ListNode(3);
        expectedHead.next.next.next = new ListNode(2);
        expectedHead.next.next.next.next = new ListNode(1);

        ListNode currentActual = p206.rReverseList(inputHead);
        ListNode currentExpect = expectedHead;

        ArrayList<Integer> expectedAL = new ArrayList<>();
        ArrayList<Integer> actualAL = new ArrayList<>();
        while(currentExpect.next!=null){
            expectedAL.add(currentExpect.val);
            currentExpect = currentExpect.next;
            actualAL.add(currentActual.val);
            currentActual = currentActual.next;
        }

        assertIterableEquals(expectedAL,actualAL);
    }
}