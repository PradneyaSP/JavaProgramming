import java.util.ArrayList;
import java.util.Arrays;

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
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0  ; i < graph.length ; i++){
            graph[i] = new ArrayList<Edge>();
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
