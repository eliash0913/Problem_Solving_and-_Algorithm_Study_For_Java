package LeetCode_Mock_Interview;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carried = false;
        int val = l1.val + l2.val;
        if(val > 9) {
            carried = true;
            val -= 10;
        } else {
            carried = false;
        }

        ListNode root = new ListNode(val);
        ListNode currentNode = root;
        while(l1.next!=null || l2.next!=null) {
            if(l1.next != null)
                l1 = l1.next;
            else
                l1.val = 0;
            if(l2.next != null)
                l2 = l2.next;
            else
                l2.val = 0;
            val = l1.val + l2.val;
            if(carried)
                val++;
            if(val > 9) {
                carried = true;
                val -= 10;
            } else {
                carried = false;
            }
            currentNode.next = new ListNode(val);
            currentNode = currentNode.next;
        }
        if(carried)
            currentNode.next = new ListNode(1);
        return root;
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode currentL1 = l1;
//        ListNode currentL2 = l2;
//
//        int power = 0;
//        int sum = (currentL1.val + currentL2.val) * (int)Math.pow(10,power++);
//        while(currentL1.next != null && currentL2.next !=null) {
//            currentL1 = currentL1.next;
//            currentL2 = currentL2.next;
//            int value = (currentL1.val + currentL2.val) * (int)Math.pow(10,power++);
//            sum += value;
//        }
//
//        while(currentL1.next != null) {
//            currentL1 = currentL1.next;
//            sum+=(currentL1.val) * (int)Math.pow(10,power++);
//        }
//
//        while(currentL2.next != null) {
//            currentL2 = currentL2.next;
//            sum+=(currentL2.val) * (int)Math.pow(10,power++);
//        }
//
//        ListNode root = new ListNode(sum%10);
//        ListNode currentNode = root;
//        sum = sum/10;
//        while(sum>0) {
//            currentNode.next = new ListNode(sum%10);
//            sum/=10;
//            currentNode = currentNode.next;
//        }
//        return root;
//    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}