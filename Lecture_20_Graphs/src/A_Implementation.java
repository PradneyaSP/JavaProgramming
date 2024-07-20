import java.util.ArrayList;
/*
* A graph data structure is a powerful tool used to represent relationships between entities.
* It's essentially a collection of nodes (also called vertices) connected by edges.
* Here's a breakdown of the key points:

1. Components:
    - Nodes (Vertices): These represent the individual entities or data points in the graph.
    - Edges: These connect the nodes, indicating a relationship between them. Edges can be:
        - Undirected: No specific direction, meaning the connection goes both ways (e.g., friendship between two people).
        - Directed: Shows a specific direction, often represented by arrows (e.g., following someone on social media).

2. Formal Representation:
    - Adjacency List: Good for sparse graphs and frequent neighbor finding.
    - Adjacency Matrix: Good for dense graphs (many edges) and frequent edge existence checks.
    - Edge List: Simpler to implement but generally less efficient.
    - 2D Matrix (Implicit Graph): Use with caution, only if the existing matrix structure already captures the relationships you want to represent.

3. Types of Graphs:
Based on the structure and direction of edges, graphs can be categorized into different types:
    - Directed Acyclic Graph (DAG): Edges have direction, but there are no cycles (loops) in the connections.
    - Undirected Graph: Edges have no specific direction, representing mutual connections.
    - Weighted Graph: Edges have weights associated with them, indicating a value or cost associated with the connection (e.g., distance between cities).

4. Applications:
Graphs are incredibly versatile and used in various fields:
    - Social Networks: Nodes represent users, and edges represent connections (friendships, following).
    - Navigation Systems: Nodes represent locations (cities), and edges represent roads connecting them.
    - Recommendation Systems: Nodes represent users or items, and edges represent connections (purchases, similar items).
    - Project Management: Nodes represent tasks, and edges represent dependencies between them.
    - Scientific Research: Modeling relationships between genes, proteins, or molecules.
 */
public class A_Implementation {
//    Making the Edge class
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
//      Creating a function to build the graph
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0  ; i < graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
//      Inserting the edges
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,3,10));
        graph[1].add(new Edge(1,2,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }

    public static void main(String[] args) {
//        Defining the number of vertices
        int V = 4;
//        Array of ArrayList
        ArrayList<Edge> []graph = new ArrayList[V];
        createGraph(graph);

//        To print the neighbours of 2
        for(int i = 0 ; i < graph[2].size() ; i++ ){
            System.out.println(graph[2].get(i).dest + " " + graph[2].get(i).wt );
        }
    }
}
