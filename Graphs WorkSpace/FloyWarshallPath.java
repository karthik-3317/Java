import java.util.*;
public class FloyWarshallPath {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nv = sc.nextInt();
        int ne = sc.nextInt();
        int adjMatrix[][] = new int[nv][nv];
        int dis[][] = new int[nv][nv];
        int prev[][] = new int[nv][nv];

        for (int i = 0; i < nv; i++) {
            for (int j = 0; j < nv; j++) {
                prev[i][j] = -1;
            }
        }

//        Filling Adjaceny Matrix
        for (int i = 0; i < ne; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            adjMatrix[u][v] = w;
            adjMatrix[v][u] = w;
            prev[u][v] = u;
        }
//        Filling Distance Matrix
        for (int i = 0; i < nv; i++) {
            for (int j = 0; j < nv; j++) {
                if (i == j) {
                    dis[i][j] = 0;
                    prev[i][i] = i;
                } else if (adjMatrix[i][j] != 0) {
                    dis[i][j] = adjMatrix[i][j];
                    prev[i][j] = i;
                } else {
                    dis[i][j] = 9999;
                }
            }
        }
        // shortest path for all vertices
        for (int mid = 0; mid < nv; mid++) {
            for (int start = 0; start < nv; start++) {
                for (int end = 0; end < nv; end++) {
                    if (dis[start][mid] + dis[mid][end] < dis[start][end]) {
                        dis[start][end] = dis[start][mid] + dis[mid][end];
                        prev[start][end] = prev[mid][end];
                    }
                }
            }
        }

        // printing the Adjacency matrix
        System.out.println("Adjacency Matrix");
        for (int i = 0; i < nv; i++) {
            for (int j = 0; j < nv; j++) {
                System.out.print(adjMatrix[i][j] + "  ");
            }
            System.out.println();
        }

        // printing the Distance matrix
        System.out.println("Distance Matrix");
        for (int i = 0; i < nv; i++) {
            for (int j = 0; j < nv; j++) {
                System.out.print(dis[i][j] + "  ");
            }
            System.out.println();
        }

//        Printing Parent Matrix
        System.out.println("Parent Matrix");
        for (int i = 0; i < nv; i++) {
            for (int j = 0; j < nv; j++) {
                System.out.print(prev[i][j] + "  ");
            }
            System.out.println();
        }


        int src = 0;
        int dest = 5;

        if (prev[src][dest] == -1) System.out.println("No Path");
        else {
            List<Integer> path = new ArrayList<>();
            path.add(dest);
//      Printing Path
            while (src != dest) {
                dest = prev[src][dest];
                path.add(dest);
            }
            System.out.println(path);
        }
    }
}
