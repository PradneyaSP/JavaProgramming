import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class B_BFSAndDFS {
    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    //      Creating a function to build the graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
//      Inserting the edges
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge>[] graph, boolean[] vis, int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean inserted = false;
        int count = 0;

        q.add(start);

        while (!q.isEmpty()) {
            int x = q.remove();
            if (!vis[x]) {
                System.out.print(x + " ");
                vis[x] = true;
                for (int j = 0; j < graph[x].size(); j++) {
                    Edge e = graph[x].get(j);
                    if (!vis[e.dest]) {
                        q.add(e.dest);
                    }
                }
            }
        }

        System.out.println("\n" + count);
    }

    public static void dfs(ArrayList<Edge>[] graph, boolean[] vis, int curr) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int j = 0; j < graph[curr].size(); j++) {
            Edge e = graph[curr].get(j);
            if (!vis[e.dest]) dfs(graph, vis, e.dest);
        }
    }

    public static void main(String[] args) {
//        Defining the number of vertices
        int V = 7;
//        Array of ArrayList
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
//        Implement this if the graph is disconnected
        boolean[] vis = new boolean[V];
//          For Breadth First Search
        System.out.print("BFS: ");
        for (int i = 0; i < V; i++) {
            if (!vis[i]) bfs(graph, vis, i);
        }
        System.out.println();
//          For Depth First Search
        boolean[] vis2 = new boolean[V];
        System.out.print("DFS: ");
        for (int i = 0; i < V; i++) {
            if (!vis2[i]) dfs(graph, vis2, i);
        }
        System.out.println();
    }
}
