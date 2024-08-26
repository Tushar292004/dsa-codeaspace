import java.util.Scanner;

public class HamiltonianCycle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        int[][] graph = new int[V][V];
        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        int[] path = new int[V];
        for (int i = 0; i < V; i++) {
            path[i] = -1;
        }

        path[0] = 0; // Start with the first vertex

        if (!findHamiltonianCycle(graph, path, 1, V)) {
            System.out.println("No Hamiltonian Cycle exists.");
        } else {
            System.out.print("Hamiltonian Cycle: ");
            for (int i = 0; i < V; i++) {
                System.out.print(path[i] + " ");
            }
            System.out.println(path[0]); // Print the first vertex again to show the cycle
        }

        scanner.close();
    }

    public static boolean findHamiltonianCycle(int[][] graph, int[] path, int pos, int V) {
        //single element in the adjancey matrix
        if (pos == V) {
            return graph[path[pos - 1]][path[0]] == 1;
        }

        for (int v = 1; v < V; v++) {
            boolean canPlace = true;
            if (graph[path[pos - 1]][v] == 0) {
                canPlace = false;
            }

            for (int i = 0; i < pos; i++) {
                if (path[i] == v) {
                    canPlace = false;
                    break;
                }
            }

            if (canPlace) {
                path[pos] = v;

                if (findHamiltonianCycle(graph, path, pos + 1, V)) {
                    return true;
                }

                path[pos] = -1;
            }
        }
        return false;
    }
}
