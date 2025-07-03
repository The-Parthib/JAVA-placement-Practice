import java.io.*;
import java.util.*;
import java.lang.Math;
import static java.util.stream.Collectors.toList;

public class Solution {
    
    static class Edge {
        int to, cost;
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
    
    static List<List<Edge>> graph;
    static Map<String, Integer> edgeCosts;
    
    public static int solve(int N, int R, int M, List<List<Integer>> edges, int Q, List<List<Integer>> queries) {
        // Build adjacency list representation of the tree
        graph = new ArrayList<>();
        edgeCosts = new HashMap<>();
        
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Add edges to the graph
        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int cost = edge.get(2);
            
            graph.get(u).add(new Edge(v, cost));
            graph.get(v).add(new Edge(u, cost));
            
            // Store edge costs for updates (use sorted order as key)
            String edgeKey = Math.min(u, v) + "-" + Math.max(u, v);
            edgeCosts.put(edgeKey, cost);
        }
        
        int totalCost = 0;
        
        // Process queries
        for (List<Integer> query : queries) {
            if (query.get(0) == 1) {
                // Type 1: Calculate transport cost between two towns
                int townA = query.get(1);
                int townB = query.get(2);
                int pathCost = findPathCost(townA, townB, N);
                totalCost += pathCost;
            } else if (query.get(0) == 2) {
                // Type 2: Update pipeline cost
                int townI = query.get(1);
                int townJ = query.get(2);
                int newCost = query.get(3);
                updateEdgeCost(townI, townJ, newCost);
            }
        }
        
        return totalCost;
    }
    
    static int findPathCost(int start, int end, int N) {
        if (start == end) return 0;
        
        boolean[] visited = new boolean[N + 1];
        int[] parent = new int[N + 1];
        Arrays.fill(parent, -1);
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        
        // BFS to find path from start to end
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            for (Edge edge : graph.get(current)) {
                if (!visited[edge.to]) {
                    visited[edge.to] = true;
                    parent[edge.to] = current;
                    queue.offer(edge.to);
                    
                    if (edge.to == end) {
                        // Found target, reconstruct path and calculate cost
                        List<Integer> path = new ArrayList<>();
                        int node = end;
                        while (node != -1) {
                            path.add(node);
                            node = parent[node];
                        }
                        Collections.reverse(path);
                        
                        int totalCost = 0;
                        for (int i = 0; i < path.size() - 1; i++) {
                            int u = path.get(i);
                            int v = path.get(i + 1);
                            String edgeKey = Math.min(u, v) + "-" + Math.max(u, v);
                            totalCost += edgeCosts.get(edgeKey);
                        }
                        return totalCost;
                    }
                }
            }
        }
        
        return 0; // Should not reach here in a connected tree
    }
    
    static void updateEdgeCost(int u, int v, int newCost) {
        String edgeKey = Math.min(u, v) + "-" + Math.max(u, v);
        edgeCosts.put(edgeKey, newCost);
        
        // Update the cost in the adjacency list
        for (Edge edge : graph.get(u)) {
            if (edge.to == v) {
                edge.cost = newCost;
                break;
            }
        }
        
        for (Edge edge : graph.get(v)) {
            if (edge.to == u) {
                edge.cost = newCost;
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = Integer.parseInt(scan.nextLine().trim());
        int R = Integer.parseInt(scan.nextLine().trim());
        int M = Integer.parseInt(scan.nextLine().trim());
        
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            edges.add(
                Arrays.asList(scan.nextLine().trim().split(" "))
                .stream().map(s -> Integer.parseInt(s)).collect(toList())
            );
        }
        
        int Q = Integer.parseInt(scan.nextLine().trim());
        
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            queries.add(
                Arrays.asList(scan.nextLine().trim().split(" "))
                .stream().map(s -> Integer.parseInt(s)).collect(toList())
            );
        }
        
        int result = solve(N, R, M, edges, Q, queries);
        System.out.println(result);
    }
}