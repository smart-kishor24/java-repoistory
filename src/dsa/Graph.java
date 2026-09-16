package dsa;

import java.util.*;

public class Graph {

    public static void main(String[] args) {

        int vertices = 4;

        // Create graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create empty list for each vertex
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Edge between 0 and 1
        graph.get(0).add(1);
        graph.get(1).add(0);

        // Edge between 0 and 2
        graph.get(0).add(2);
        graph.get(2).add(0);

        // Edge between 1 and 3
        graph.get(1).add(3);
        graph.get(3).add(1);

        // Edge between 2 and 3
        graph.get(2).add(3);
        graph.get(3).add(2);

        // Display graph
        for (int i = 0; i < vertices; i++) {

            System.out.print(i + " -> ");

            for (int node : graph.get(i)) {
                System.out.print(node + " ");
            }

            System.out.println();
        }
    }
}