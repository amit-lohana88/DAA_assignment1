package Q1;

import java.util.*;

public class List {

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < vertices; i++) {
            for(int j = 0; j < vertices; j++) {
                if(i != j) {
                    graph.get(i).add(j);
                }
            }
        }

        System.out.println("Adjacency List:");

        for(int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for(int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }
}