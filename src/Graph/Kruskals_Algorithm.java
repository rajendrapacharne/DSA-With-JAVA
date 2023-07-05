package Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kruskals_Algorithm {
    static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Subset {
        int parent, rank;

        public Subset(int parent, int rank) {
            this.parent = parent;
            this.rank = rank;
        }
    }

    public static void kruskal(int v, List<Edge> edges) {
        int noOfEdges = 0;
        Edge[] result = new Edge[v];

        Subset[] subsets = new Subset[v];
        for (int i = 0; i < v; i++) {
            subsets[i] = new Subset(i, 0);
        }

        // Sort the edges in non-decreasing order of their weights
        edges.sort(Comparator.comparingInt(e -> e.weight));

        // Process each edge in sorted order
        for (Edge edge : edges) {
            int x = findRoot(subsets, edge.src);
            int y = findRoot(subsets, edge.dest);

            // Check if including the edge causes a cycle in the MST
            if (x != y) {
                result[noOfEdges] = edge; // Add the edge to the MST
                unions(subsets, x, y); // Union the subsets of x and y
                noOfEdges++;
            }
        }

        System.out.println("Following are the edges to create MST:");
        int minCost = 0;
        for (int i = 0; i < noOfEdges; i++) {
            System.out.println(result[i].src + " -- " + result[i].dest + " -- " + result[i].weight);
            minCost += result[i].weight;
        }

        System.out.println("Total weight of MST: " + minCost);
    }

    public static void unions(Subset[] subsets, int x, int y) {
        int rootX = findRoot(subsets, x);
        int rootY = findRoot(subsets, y);
        if (subsets[rootY].rank < subsets[rootX].rank) {
            subsets[rootY].parent = rootX;
        } else if (subsets[rootX].rank < subsets[rootY].rank) {
            subsets[rootX].parent = rootY;
        } else {
            subsets[rootY].parent = rootX;
            subsets[rootX].rank++;
        }
    }

    public static int findRoot(Subset[] subsets, int i) {
        if (subsets[i].parent != i) {
            subsets[i].parent = findRoot(subsets, subsets[i].parent);
        }
        return subsets[i].parent;
    }

    public static void main(String[] args) {
        int v = 4;
        List<Edge> graphEdges = new ArrayList<>(List.of(
                new Edge(0, 1, 10),
                new Edge(0, 2, 6),
                new Edge(0, 3, 5),
                new Edge(1, 3, 15),
                new Edge(2, 3, 4)
        ));

        kruskal(v, graphEdges);
    }
}
