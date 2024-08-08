package DataStructuresImplementing.graph;


import java.util.LinkedList;

class Graph {
    private int numVertices;
    private LinkedList<Integer> adjLists[];

    Graph(int vertices) {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    public static void main(String args[]) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Graph:");
        for(int v = 0; v < g.numVertices; v++) {
            System.out.print(v + ": ");
            for(int w : g.adjLists[v]) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
    }
}