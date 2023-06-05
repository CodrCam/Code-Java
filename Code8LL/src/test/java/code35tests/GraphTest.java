package code35tests;

import Code35.Graph;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

public class GraphTest {
    Graph graph;

    @BeforeEach
    public void setup() {
        graph = new Graph();
    }

    @Test
    public void testAddNode() {
        Graph.Node node = graph.addNode(1);
        assertEquals(1, node.value);
        assertEquals(1, graph.size());
    }

    @Test
    public void testAddEdge() {
        Graph.Node node1 = graph.addNode(1);
        Graph.Node node2 = graph.addNode(2);
        graph.addEdge(node1, node2, 10);
        assertTrue(node1.getNeighbors().containsKey(node2));
        assertTrue(node2.getNeighbors().containsKey(node1));
        assertEquals(Integer.valueOf(10), node1.getNeighbors().get(node2));
        assertEquals(Integer.valueOf(10), node2.getNeighbors().get(node1));
    }

    @Test
    public void testGetNodes() {
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        Collection<Graph.Node> nodes = graph.getNodes();
        assertEquals(3, nodes.size());
    }

    @Test
    public void testGetNeighbors() {
        Graph.Node node1 = graph.addNode(1);
        Graph.Node node2 = graph.addNode(2);
        graph.addEdge(node1, node2, 10);
        HashMap<Graph.Node, Integer> neighbors = graph.getNeighbors(node1);
        assertTrue(neighbors.containsKey(node2));
        assertEquals(Integer.valueOf(10), neighbors.get(node2));
    }

    @Test
    public void testSize() {
        graph.addNode(1);
        graph.addNode(2);
        assertEquals(2, graph.size());
    }

    @Test
    public void testSingleSingleNodeGraph() {
        Graph.Node node1 = graph.addNode(1);
        graph.addEdge(node1, node1);
        assertTrue(node1.getNeighbors().containsKey(node1));
    }
}
