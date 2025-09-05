package src.collection.list.arrayList;

import java.util.ArrayList;

public class TwoDArray {
    public static void main(String[] args) {
        int vertexCount = 3;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertexCount);
        for (int i = 0; i < vertexCount; i++) {
            graph.add(new ArrayList<>());
        }
        //add all the edges
        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(0);
        //also need to addd the edges
        graph.get(1).add(0);
        graph.get(2).add(1);
        graph.get(0).add(2);

        vertexCount = graph.size();
        for (int i = 0; i < vertexCount; i++) {
            int edgeCount = graph.get(i).size();
            for (int j = 0; j < edgeCount; j++) {
                Integer startVertex = i;
                Integer endVertex = graph.get(i).get(j);
                System.out.printf("Vertex %d is connected to vertex %d%n", startVertex, endVertex);
            }
        }
    }
}
