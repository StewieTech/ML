package w4ek.Prim;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        // create vertices for graph
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);

        // create edges for graph
        Set<Edge<Integer>> edges = new HashSet<>();
        edges.add(new Edge<>(v1, v2, 1));
        edges.add(new Edge<>(v1, v3, 4));
        edges.add(new Edge<>(v1, v4, 3));
        edges.add(new Edge<>(v2, v3, 2));
        edges.add(new Edge<>(v2, v4, 5));
        edges.add(new Edge<>(v3, v4, 6));
        edges.add(new Edge<>(v3, v5, 7));
        edges.add(new Edge<>(v4, v5, 8));

        // create graph from vertices and edges
        Graph<Integer> graph = new Graph<>(Set.of(v1, v2, v3, v4, v5), edges);

        // test Prims algorithm
        System.out.println("Running Prims algorithm on graph...");
        Set<Edge<Integer>> mst = GraphAlgorithms.prims(v1, graph);
        if (mst == null) {
            System.out.println("Graph is disconnected.");
        } else {
            System.out.println("Minimum Spanning Tree:");
            for (Edge<Integer> e : mst) {
                System.out.println(e);
            }
        }

        // test with disconnected graph
        System.out.println("\nTesting with disconnected graph...");
        Set<Vertex<Integer>> vertices = new HashSet<>();
        vertices.add(new Vertex<>(1));
        vertices.add(new Vertex<>(2));
        vertices.add(new Vertex<>(3));
        edges.clear();
        edges.add(new Edge<>(v1, v2, 1));
        edges.add(new Edge<>(v2, v1, 1)); // add reverse edge for testing
        Graph<Integer> disconnectedGraph = new Graph<>(vertices, edges);
        mst = GraphAlgorithms.prims(v1, disconnectedGraph);
        if (mst == null) {
            System.out.println("Graph is disconnected.");
        } else {
            System.out.println("Minimum Spanning Tree:");
            for (Edge<Integer> e : mst) {
                System.out.println(e);
            }
        }

        // test with self-loop and parallel edges
        System.out.println("\nTesting with self-loop and parallel edges...");
        vertices.clear();
        edges.clear();
        Vertex<Integer> v6 = new Vertex<>(6);
        Vertex<Integer> v7 = new Vertex<>(7);
        vertices.add(v6);
        vertices.add(v7);
        edges.add(new Edge<>(v6, v7, 2));
        edges.add(new Edge<>(v6, v7, 3)); // parallel edge
        edges.add(new Edge<>(v6, v6, 1)); // self-loop
        Graph<Integer> invalidGraph = new Graph<>(vertices, edges);
        mst = GraphAlgorithms.prims(v6, invalidGraph);
        if (mst == null) {
            System.out.println("Graph is disconnected.");
        } else {
            System.out.println("Minimum Spanning Tree:");
        }
    }
}

