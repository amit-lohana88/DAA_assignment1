package Q1;

import java.util.ArrayList;

public class Edge {

    public static void main(String[] args) {

        ArrayList<String> edges = new ArrayList<>();

        // Add edges
        edges.add("0 - 1");
        edges.add("0 - 2");
        edges.add("0 - 3");
        edges.add("1 - 2");
        edges.add("1 - 3");
        edges.add("2 - 3");

        System.out.println("Edge List:");

        for (String edge : edges) {
            System.out.println(edge);
        }
    }
}