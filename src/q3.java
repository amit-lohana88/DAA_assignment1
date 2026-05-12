import java.util.*;

public class q3 {

    static Map<Character, List<Character>> graph = new HashMap<>();
    static Set<Character> visited = new HashSet<>();
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {

        addEdge('m','q'); addEdge('m','t'); addEdge('m','x');

        addEdge('n','o'); addEdge('n','q'); addEdge('n','u'); addEdge('n','r');

        addEdge('o','r'); addEdge('o','s'); addEdge('o','v');

        addEdge('p','o'); addEdge('p','s'); addEdge('p','z');

        addEdge('q','t');

        addEdge('r','u'); addEdge('r','y');

        addEdge('s','r');

        addEdge('u','t');

        addEdge('v','w'); addEdge('v','x');

        addEdge('y','v');

        addEdge('w','z');

        // Run DFS for all nodes
        for (char node : graph.keySet()) {
            if (!visited.contains(node)) {
                dfs(node);
            }
        }

        System.out.println("Topological Sort Order:");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    static void addEdge(char u, char v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
    }

    static void dfs(char node) {
        visited.add(node);

        for (char neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor);
            }
        }

        stack.push(node);
    }
}