import java.util.*;

// This class represents an undirected graph using an adjacency list to store nodes and their connections
public class Graph<T> {

    // Map to store nodes and their adjacent nodes
    private Map<T, Set<T>> adjacencyList;

    // Constructor initializes the adjacency list
    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    // Method to add a new node to the graph
    public void addNode(T node) {

        // Create an entry in the adjacency list for the new node with an empty set of adjacent nodes
        adjacencyList.put(node, new HashSet<>());
    }

    // Method to add an edge (connection) between two nodes in the graph
    public void addEdge(T node1, T node2) {

        // Add node2 to the set of adjacent nodes for node1, and vice versa
        adjacencyList.get(node1).add(node2);
        adjacencyList.get(node2).add(node1);
    }

    // Method to retrieve the set of adjacent nodes for a given node
    public Set<T> getAdjacentNodes(T node) {
        return adjacencyList.get(node);
    }

    // Method to retrieve a set containing all nodes in the graph
    public Set<T> getAllNodes() {
        return adjacencyList.keySet();
    }
}
