import java.util.*;

public class MonkeySwinging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        // Build graph of trees and hanging spots
        Map<Integer, Map<Integer, List<Integer>>> treeGraph = new HashMap<>(); // tree -> (node -> neighbors)
        Map<Integer, Set<Integer>> nodeToTrees = new HashMap<>(); // node -> set of trees it belongs to

        int currentTree = 0;

        for (int i = 0; i < n - 1; i++) { // n-1 because last line is start/end
            String line = scanner.nextLine().trim();

            if (line.equals("break")) {
                currentTree++;
                continue;
            }

            String[] parts = line.split(" ");
            int parent = Integer.parseInt(parts[0]);

            // Add parent to tree mapping
            nodeToTrees.putIfAbsent(parent, new HashSet<>());
            nodeToTrees.get(parent).add(currentTree);

            // Initialize tree structure if needed
            treeGraph.putIfAbsent(currentTree, new HashMap<>());
            treeGraph.get(currentTree).putIfAbsent(parent, new ArrayList<>());

            for (int j = 1; j < parts.length; j++) {
                int child = Integer.parseInt(parts[j]);

                // Add child to tree mapping
                nodeToTrees.putIfAbsent(child, new HashSet<>());
                nodeToTrees.get(child).add(currentTree);

                // Add bidirectional edges within this tree
                treeGraph.get(currentTree).putIfAbsent(child, new ArrayList<>());
                treeGraph.get(currentTree).get(parent).add(child);
                treeGraph.get(currentTree).get(child).add(parent);
            }
        }

        // Read start and end nodes
        String[] lastLine = scanner.nextLine().trim().split(" ");
        int start = Integer.parseInt(lastLine[0]);
        int end = Integer.parseInt(lastLine[1]);
        scanner.close();

        int result = findMinimumEnergy(treeGraph, nodeToTrees, start, end);
        System.out.println(result);
    }

    private static int findMinimumEnergy(Map<Integer, Map<Integer, List<Integer>>> treeGraph,
            Map<Integer, Set<Integer>> nodeToTrees,
            int start, int end) {
        // State: [node, tree, energy]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        Map<String, Integer> minEnergy = new HashMap<>(); // Keep track of min energy for each state

        // Add all possible starting positions
        for (int tree : nodeToTrees.getOrDefault(start, new HashSet<>())) {
            String state = start + "," + tree;
            pq.offer(new int[] { start, tree, 0 });
            minEnergy.put(state, 0);
        }

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int tree = current[1];
            int energy = current[2];

            // Found destination
            if (node == end) {
                return energy;
            }

            String state = node + "," + tree;
            // Skip if we've found a better path to this state already
            if (minEnergy.containsKey(state) && minEnergy.get(state) < energy) {
                continue;
            }

            // Option 1: Move within the same tree
            if (treeGraph.containsKey(tree) && treeGraph.get(tree).containsKey(node)) {
                for (int neighbor : treeGraph.get(tree).get(node)) {
                    int newEnergy = energy;
                    if (neighbor > node) {
                        newEnergy++; // Energy cost when climbing up
                    }

                    String newState = neighbor + "," + tree;
                    if (!minEnergy.containsKey(newState) || newEnergy < minEnergy.get(newState)) {
                        minEnergy.put(newState, newEnergy);
                        pq.offer(new int[] { neighbor, tree, newEnergy });
                    }
                }
            }

            // Option 2: Switch trees at the same node
            for (int newTree : nodeToTrees.getOrDefault(node, new HashSet<>())) {
                if (newTree != tree) {
                    int newEnergy = energy + 1; // Energy cost for tree switching

                    String newState = node + "," + newTree;
                    if (!minEnergy.containsKey(newState) || newEnergy < minEnergy.get(newState)) {
                        minEnergy.put(newState, newEnergy);
                        pq.offer(new int[] { node, newTree, newEnergy });
                    }
                }
            }
        }

        return -1; // Destination not reachable
    }
}
