package dsa;

import java.util.ArrayList;

public class CityGraph {

    // Method to add a road between two cities
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // Method to remove a road between two cities
    static void removeEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).remove(Integer.valueOf(v));
        graph.get(v).remove(Integer.valueOf(u));
    }

    // Method to display the road network
    static void displayGraph(ArrayList<ArrayList<Integer>> graph) {

        for (int i = 0; i < graph.size(); i++) {

            System.out.print("City " + i + " -> ");

            for (int city : graph.get(i)) {
                System.out.print(city + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Number of cities
        int cities = 5;

        // Create graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create an empty ArrayList for each city
        for (int i = 0; i < cities; i++) {
            graph.add(new ArrayList<>());
        }

        // Add roads
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);

        // Display network before removing road
        System.out.println("Road Network Before Removing Road:");
        displayGraph(graph);

        // Remove road 0 - 1
        removeEdge(graph, 0, 1);

        // Display updated network
        System.out.println("\nRoad Network After Removing Road 0 - 1:");
        displayGraph(graph);
    }
}