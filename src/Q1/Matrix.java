package Q1;

import java.util.*;

public class Matrix {
    public static void main(String[] args) {

        int vertices = 4;

        int[][] graph = new int[vertices][vertices];

        for(int i = 0; i < vertices; i++) {
            for(int j = 0; j < vertices; j++) {
                if(i != j) {
                    graph[i][j] = 1;
                }
            }
        }

        System.out.println("Adjacency Matrix:");

        for(int i = 0; i < vertices; i++) {
            for(int j = 0; j < vertices; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
