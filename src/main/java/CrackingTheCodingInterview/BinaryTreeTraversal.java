package CrackingTheCodingInterview;

public class BinaryTreeTraversal {
    public void preOrder(Node node) {
        if(node!=null) {
            displayValue(node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(Node node) {
        if(node!=null) {
            inOrder(node.left);
            displayValue(node.value);
            inOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if(node!=null) {
            postOrder(node.left);
            postOrder(node.right);
            displayValue(node.value);
        }
    }

    public void displayValue(int value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);

        BinaryTreeTraversal btt = new BinaryTreeTraversal();
        System.out.println("Pre Order");
        btt.preOrder(head);

        System.out.println("in Order");
        btt.inOrder(head);

        System.out.println("Post Order");
        btt.postOrder(head);
    }
}