import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();
        int adj[][] = new int[vertices][vertices];
        for(int i=0;i<edges;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u][v]= 1;
        }
        printAdjacenyMatrix(adj);
        int ind[] = indegreeMatrix(adj);
        printSingleMatrix(ind);
        int outd[] = outdegreeMatrix(adj);
        printSingleMatrix(outd);
    }
    public static void printSingleMatrix(int[] arr)
    {
        for(int x:arr)
        {
            System.out.print(x +" ");
        }
    }
    public static void printAdjacenyMatrix(int [][] adj)
    {
        for(int i=0;i<adj.length;i++)
        {
            for(int j=0;j<adj[0].length;j++)
            {
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[] indegreeMatrix(int [][] adj)
    {
        int[] indg = new int[adj.length];
        for(int i=0;i<adj.length;i++)
        {
            int count =0;
            for(int j=0;j<adj.length;j++)
            {
                if(adj[i][j] !=0)
                    count++;
            }
            indg[i] = count;
        }
        return indg;
    }public static int[] outdegreeMatrix(int [][] adj)
    {
        int[] outdg = new int[adj[0].length];
        for(int i=0;i<adj[0].length;i++)
        {
            int count =0;
            for(int j=0;j<adj[0].length;j++)
            {
                if(adj[i][j] !=0)
                    count++;
            }
            outdg[i] = count;
        }
        return outdg;
    }
}
