package CrackingTheCodingInterview;

import java.util.LinkedList;
import java.util.Queue;

public class GraphSearch {

    //Depth First Search, travel until reaches to the deepest level and move to another path.
    void DepthFirstSearch(Node node) {
        visit(node);
        node.isVisited = true;
        for (Node child : node.children) {
            if (!child.isVisited)
                DepthFirstSearch(child);
        }
    }

    //Breadth First Search, travel the same levels and then move deeper level.
    void BreadthFirstSearch(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        node.isVisited = true;

        while(!queue.isEmpty()) {
            Node newNode = queue.poll();
            visit(newNode);
            for(Node child : newNode.children) {
                if(!child.isVisited){
                    queue.add(child);
                    child.isVisited=true;
                }

            }
        }
    }

    void visit(Node node) {
        System.out.println(node.name);
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        Node A = new Node("Node 0");
        Node B = new Node("Node 1");
        Node C = new Node("Node 2");
        Node D = new Node("Node 3");
        Node E = new Node("Node 4");
        Node F = new Node("Node 5");

        A.children = new Node[]{B, E, F};
        B.children = new Node[]{D, E};
        C.children = new Node[]{B};
        D.children = new Node[]{C, E};
        E.children = new Node[]{};
        F.children = new Node[]{};
        g.nodes = new Node[]{A, B, C, D, E, F};
        GraphSearch gs = new GraphSearch();
        System.out.println("DFS");
        gs.DepthFirstSearch(A);
        System.out.println();

        A = new Node("Node 0");
        B = new Node("Node 1");
        C = new Node("Node 2");
        D = new Node("Node 3");
        E = new Node("Node 4");
        F = new Node("Node 5");


        A.children = new Node[]{B, E, F};
        B.children = new Node[]{D, E};
        C.children = new Node[]{B};
        D.children = new Node[]{C, E};
        E.children = new Node[]{};
        F.children = new Node[]{};
        g.nodes = new Node[]{A, B, C, D, E, F};
        System.out.println("BFS");
        gs.BreadthFirstSearch(A);

    }


}


