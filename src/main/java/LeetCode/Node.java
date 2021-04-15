package LeetCode;

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class TestHelper{
    static ListNode GenerateListNodeFromArray(int[] arr){
        if(arr.length==0)
            return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for(int i = 1; i< arr.length; i++){
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    static Integer[] GenerateArrayFromListNodes(ListNode head){
        if(head==null)
            return new Integer[0];
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode current = head;
        while(current.next!=null){
            arrayList.add(current.val);
            current = current.next;
        }
        arrayList.add(current.val);
        Integer[] arr = new Integer[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            arr[i] = arrayList.get(i);
        }
        return arr;
    }

    static TreeNode GenerateBinaryTreeFromArray(Integer[] arr) {
        TreeNode head = null;
        if(arr.length==0)
            return head;
        Queue<Integer> v = new LinkedList();
        for(Integer n : arr) {
            if(n!=null)
                v.add(n);
            else
                v.add(null);

        }
        Queue queue = new LinkedList();
        head = new TreeNode(v.poll());
        queue.add(head);
        addNewTreeNode(v,queue);
        return head;
    }

    static void addBinaryNewTreeNode(int value, TreeNode node){
        if(node.val > value){
            if(node.left==null)
                node.left = new TreeNode(value);
            else
                addBinaryNewTreeNode(value, node.left);
        } else {
            if(node.right==null)
                node.right = new TreeNode(value);
            else
                addBinaryNewTreeNode(value, node.right);
        }
    }

    static void addNewTreeNode(Queue<Integer> v, Queue<TreeNode> queue){
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(!v.isEmpty()) {
                if(v.peek()!=null) {
                    node.left = new TreeNode(v.poll());
                    queue.add(node.left);
                } else {
                    v.poll();
                    queue.add(null);
                }
            }
            if(!v.isEmpty()) {
                if(v.peek()!=null) {
                    node.right = new TreeNode(v.poll());
                    queue.add(node.right);
                } else {
                    v.poll();
                    queue.add(null);
                }
            }
        }
    }

    static Integer[] GenerateArrayFromBinaryTree(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList();
        Queue<TreeNode> vals = new LinkedList<>();
        queue.add(node);
        vals.add(node);
        while(!queue.isEmpty()){
            TreeNode head = queue.poll();
            if(head.left!=null){
                vals.add(head.left);
                queue.add(head.left);
            }
            if(head.right!=null){
                vals.add(head.right);
                queue.add(head.right);
            }
        }
        Integer[] arr = new Integer[vals.size()];
        int index = 0;
        while(!vals.isEmpty())
            arr[index++]=vals.poll().val;
        return arr;
    }
}

