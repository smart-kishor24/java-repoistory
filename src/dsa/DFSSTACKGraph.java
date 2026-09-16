package dsa;

import java.util.*;

public class DFSSTACKGraph {

    // DFS using Stack
    static void dfs(ArrayList<ArrayList<Integer>> graph, int start) {

        boolean[] visited = new boolean[graph.size()];

        Stack<Integer> stack = new Stack<>();

        // Start node
        stack.push(start);

        while (!stack.isEmpty()) {

            int current = stack.pop();

            // If already visited, skip it
            if (visited[current]) {
                continue;
            }

            // Mark as visited
            visited[current] = true;

            // Print current node
            System.out.print(current + " ");

            // Add neighbours to stack
            for (int neighbour : graph.get(current)) {

                if (!visited[neighbour]) {
                    stack.push(neighbour);
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        int vertices = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create adjacency list
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 5);

        // Perform DFS
        System.out.println("DFS Traversal:");

        dfs(graph, 0);
    }

    // Method to add an edge
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {

        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}