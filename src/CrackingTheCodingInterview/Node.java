package CrackingTheCodingInterview;

public class Node {
    String name;
    Node[] children;
    boolean isVisited = false;
    Node left;
    Node right;
    int value;
    public Node(int value) {
        this.value = value;
    }
    public Node(String name) {
        this.name = name;
    }
}
