package Code35;

import java.util.*;

public class Graph {
    private HashMap<Integer, Node> nodes = new HashMap<>();

    public class Node {
        public int value;
        private HashMap<Node, Integer> neighbors = new HashMap<>();

        public Node(int value) {
            this.value = value;
        }

        public HashMap<Node, Integer> getNeighbors() {
            return neighbors;
        }
    }

    public Node addNode(int value) {
        Node node = new Node(value);
        nodes.put(value, node);
        return node;
    }

    public void addEdge(Node node1, Node node2, int weight) {
        node1.getNeighbors().put(node2, weight);
        node2.getNeighbors().put(node1, weight);
    }

    public void addEdge(Node node1, Node node2) {
        addEdge(node1, node2, 0);
    }

    public Collection<Node> getNodes() {
        return nodes.values();
    }

    public HashMap<Node, Integer> getNeighbors(Node node) {
        return node.getNeighbors();
    }

    public int size() {
        return nodes.size();
    }
}

