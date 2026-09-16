package dsa;

import java.util.*;

public class GraphBasic {

    // Create a graph with the given number of vertices
    static ArrayList<ArrayList<Integer>> createGraph(int vertices) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        return graph;
    }

    // Add an undirected edge between u and v
    static void addEdge(
            ArrayList<ArrayList<Integer>> graph,
            int u,
            int v) {

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // Display the graph
    static void displayGraph(
            ArrayList<ArrayList<Integer>> graph) {

        for (int i = 0; i < graph.size(); i++) {

            System.out.print("Vertex " + i + " -> ");

            for (int vertex : graph.get(i)) {
                System.out.print(vertex + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Number of vertices
        int vertices = 5;

        // Create graph
        ArrayList<ArrayList<Integer>> graph = createGraph(vertices);

        // Add edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
  
        displayGraph(graph);
    }
}