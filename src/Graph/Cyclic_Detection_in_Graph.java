package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Cyclic_Detection_in_Graph {

    private int v;
    private LinkedList<Integer> adj[];

    @SuppressWarnings("unchecked")
    public Cyclic_Detection_in_Graph(int vertices) {
        v = vertices;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int u) {
        adj[v].add(u);
        adj[u].add(v);
    }

    public boolean isCyclicUtil(int v, boolean[] visited, int parent) {
        visited[v] = true;
        Integer i;

        Iterator<Integer> itr = adj[v].iterator();
        while (itr.hasNext()) {
            i = itr.next();
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, v)) {
                    return true;
                }
            } else if (i != parent) {
                return true;
            }
        }
        return false;
    }

    public boolean isCyclic() {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v1 = 5;
        Cyclic_Detection_in_Graph graph1 = new Cyclic_Detection_in_Graph(v1);
        graph1.addEdge(1, 0);
        graph1.addEdge(0, 2);
        graph1.addEdge(2, 1);
        graph1.addEdge(0, 3);
        graph1.addEdge(3, 4);
        if (graph1.isCyclic()) {
            System.out.println("Graph contains a cycle.");
        } else {
            System.out.println("Graph does not contain a cycle.");
        }

        Cyclic_Detection_in_Graph graph2 = new Cyclic_Detection_in_Graph(v1);
        graph2.addEdge(1, 2);
        graph2.addEdge(1, 3);
        if (graph2.isCyclic()) {
            System.out.println("Graph contains a cycle.");
        } else {
            System.out.println("Graph does not contain a cycle.");
        }
    }
}
