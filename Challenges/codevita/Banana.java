import java.util.*;

public class Banana {
    static class Edge {
        int to, cost;
        Edge(int t, int c) {
            to = t;
            cost = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of lines (includes "break" and final start/dest line)
        int N = Integer.parseInt(sc.nextLine().trim());

        Map<Integer, List<Edge>> graph = new HashMap<>();
        List<List<int[]>> trees = new ArrayList<>();
        List<int[]> currentTree = new ArrayList<>();

        // Read N - 1 lines (because last one is start & dest)
        for (int i = 0; i < N - 1; i++) {
            if (!sc.hasNextLine()) break;
            String line = sc.nextLine().trim();

            if (line.isEmpty()) continue; // skip empty lines

            if (line.equals("break")) {
                if (!currentTree.isEmpty()) {
                    trees.add(currentTree);
                }
                currentTree = new ArrayList<>();
                continue;
            }

            String[] parts = line.split(" ");
            int[] nums = new int[parts.length];
            for (int j = 0; j < parts.length; j++) {
                nums[j] = Integer.parseInt(parts[j]);
            }
            currentTree.add(nums);
        }

        // Last line -> start and destination
        String[] last = sc.nextLine().trim().split(" ");
        int start = Integer.parseInt(last[0]);
        int dest = Integer.parseInt(last[1]);

        // Add the last tree if not added
        if (!currentTree.isEmpty()) trees.add(currentTree);

        // Build graph for all trees
        for (List<int[]> tree : trees) {
            for (int[] line : tree) {
                if (line.length < 2) continue;
                int parent = line[0];
                for (int i = 1; i < line.length; i++) {
                    int child = line[i];

                    // upward edge (cost = 1)
                    graph.computeIfAbsent(parent, k -> new ArrayList<>()).add(new Edge(child, 1));
                    // downward edge (cost = 0)
                    graph.computeIfAbsent(child, k -> new ArrayList<>()).add(new Edge(parent, 0));
                }
            }
        }

        // Run Dijkstra to find minimum energy
        int ans = minEnergy(graph, start, dest);
        System.out.println(ans);
    }

    static int minEnergy(Map<Integer, List<Edge>> graph, int start, int dest) {
        Map<Integer, Integer> dist = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{start, 0});
        dist.put(start, 0);

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0];
            int cost = cur[1];

            if (node == dest) return cost;

            if (!graph.containsKey(node)) continue; // skip disconnected nodes

            for (Edge e : graph.get(node)) {
                int newCost = cost + e.cost;
                if (newCost < dist.getOrDefault(e.to, Integer.MAX_VALUE)) {
                    dist.put(e.to, newCost);
                    pq.offer(new int[]{e.to, newCost});
                }
            }
        }

        return -1; // destination unreachable
    }
}
