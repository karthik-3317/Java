import java.util.*;
public class FloydWarshall {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nv = sc.nextInt();
        int ne = sc.nextInt();
        int adjMatrix[][] = new int[nv][nv];
        int dis[][] = new int[nv][nv];

//        Filling AdjacencyMatrix
        for(int i=0;i<ne;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            adjMatrix[u][v] = w;
            adjMatrix[v][u] = w;
        }
        // filling distance matrix
        for(int i=0;i<nv;i++)
        {
            for(int j=0;j<nv;j++)
            {
                if(i==j) dis[i][j] = 0;
                else if(adjMatrix[i][j]!=0) dis[i][j] = adjMatrix[i][j];
                else dis[i][j] = 9999;
            }
        }
        // shortest path for all vertices
        for(int mid=0;mid<nv;mid++)
        {
            for(int start=0;start<nv;start++)
            {
                for(int end=0;end<nv;end++)
                {
                    if(dis[start][mid]+dis[mid][end]<dis[start][end]){
                        dis[start][end] = dis[start][mid]+dis[mid][end];
                    }
                }
            }
        }
        // printing the Adjacency matrix
        System.out.println("Adjacency Matrix");
        for(int i=0;i<nv;i++)
        {
            for(int j=0;j<nv;j++)
            {
                System.out.print(adjMatrix[i][j]+"  ");
            }
            System.out.println();
        }
        // printing the Distance matrix
        System.out.println("Distance Matrix");
        for(int i=0;i<nv;i++)
        {
            for(int j=0;j<nv;j++)
            {
                System.out.print(dis[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
