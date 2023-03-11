package w4ek.GraphT;

public class test {
Graph<Integer> graph = new Graph<>();
Vertex<Integer> v1 = graph.addVertex(1);
Vertex<Integer> v2 = graph.addVertex(2);
Vertex<Integer> v3 = graph.addVertex(3);
Vertex<Integer> v4 = graph.addVertex(4);
Vertex<Integer> v5 = graph.addVertex(5);
Vertex<Integer> v6 = graph.addVertex(6);
Vertex<Integer> v7 = graph.addVertex(7);

graph.addEdge(v1, v2);
graph.addEdge(v1, v3);
graph.addEdge(v2, v4);
graph.addEdge(v3, v4);
graph.addEdge(v3, v5);
graph.addEdge(v4, v6);
graph.addEdge(v5, v6);
graph.addEdge(v6, v7);

List<Vertex<Integer>> bfsResult = GraphAlgorithms.bfs(v1, graph);
System.out.println("BFS result: " + bfsResult);

List<Vertex<Integer>> dfsResult = GraphAlgorithms.dfs(v1, graph);
System.out.println("DFS result: " + dfsResult);

}
