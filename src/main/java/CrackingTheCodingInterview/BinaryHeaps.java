package CrackingTheCodingInterview;

public class BinaryHeaps {
    void sort(Node node) {
        if(node.left != null) {
            if (node.left.value < node.value) {
                swap(node.left, node);
                sort(node.left);
                System.out.println("Left");
            }
        }
        if(node.right != null) {
            if (node.right.value < node.value) {
                swap(node.right, node);
                sort(node.right);
                System.out.println("Right");
            }
        }
    }

    void swap(Node node, Node cNode) {
        int tmp = node.value;
        node.value = cNode.value;
        cNode.value = tmp;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.left = new Node(1);
        head.right = new Node(3);
        head.left.left = new Node(2);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);

        BinaryTreeTraversal btt = new BinaryTreeTraversal();
        System.out.println(head.value);
        System.out.println(" " + head.left.value + " " + head.right.value + " ");
        System.out.println(head.left.left.value + " " + head.left.right.value + " " + head.right.left.value + " " + head.right.right.value);

        BinaryHeaps bh = new BinaryHeaps();
        bh.sort(head);
        System.out.println(head.value);
        System.out.println(" " + head.left.value + " " + head.right.value + " ");
        System.out.println(head.left.left.value + " " + head.left.right.value + " " + head.right.left.value + " " + head.right.right.value);

    }
}




