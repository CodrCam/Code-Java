package GraphTest;

import Code36.Graph;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {
    @Test
    public void testBreadthFirst() {
        Graph graph = new Graph();
        Graph.Node node1 = new Graph.Node("Pandora");
        Graph.Node node2 = new Graph.Node("Arendelle");
        Graph.Node node3 = new Graph.Node("Metroville");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);

        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);

        List<Graph.Node> visited = graph.breadthFirst(node1);
        assertEquals(3, visited.size());
        assertEquals(node1, visited.get(0));
        assertEquals(node2, visited.get(1));
        assertEquals(node3, visited.get(2));
    }

    @Test
    public void testPathExists() {
        Graph graph = new Graph();
        Graph.Node node1 = new Graph.Node("Pandora");
        Graph.Node node2 = new Graph.Node("Arendelle");
        Graph.Node node3 = new Graph.Node("Metroville");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);

        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);

        assertTrue(graph.pathExists(node1, node2));
        assertTrue(graph.pathExists(node1, node3));
        assertFalse(graph.pathExists(node2, node3));
    }
}
