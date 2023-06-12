package Code36;

import java.util.*;

public class Graph {
    private Map<Node, List<Node>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    // Inner class for Node
    public static class Node {
        String name;

        public Node(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public void addNode(Node node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(Node node1, Node node2) {
        adjacencyList.get(node1).add(node2);
        adjacencyList.get(node2).add(node1);
    }

    public List<Node> breadthFirst(Node start) {
        List<Node> visited = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (!visited.contains(currentNode)) {
                visited.add(currentNode);

                List<Node> neighbors = adjacencyList.get(currentNode);
                if (neighbors != null) {
                    queue.addAll(neighbors);
                }
            }
        }
        return visited;
    }

    public boolean pathExists(Node start, Node end) {
        List<Node> visited = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (currentNode.equals(end)) {
                return true;
            }

            if (!visited.contains(currentNode)) {
                visited.add(currentNode);

                List<Node> neighbors = adjacencyList.get(currentNode);
                if (neighbors != null) {
                    queue.addAll(neighbors);
                }
            }
        }
        return false;
    }
}
