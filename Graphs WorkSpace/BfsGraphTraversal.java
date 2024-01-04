import java.util.*;

class BfsGraphTraversal{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception{
        int nv = sc.nextInt(), ne = sc.nextInt();

        Map<Integer, List<Integer>> g = new HashMap<>();
        for (int i = 0; i < nv; i++) {
            g.put(i, new ArrayList<>());
        }

        for (int i = 0; i < ne; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }

//        for(int u : g.keySet()){
//            System.out.print(u + ": ");
//            for(int v : g.get(u))
//                System.out.print(v + " ");
//            System.out.println();
//        }
        Set<Integer> vis = new HashSet<>();
//        int islandCount = 0;
//        for(int u = 0; u < nv; u++){
//            if(!vis.contains(u)){
//                dfs(g, u, vis);
//                islandCount++;
//            }
//        }
//        System.out.println(islandCount);
        int src = 4,des = 7;
        int dis[] = new int[nv];
        int parent[] = new int[nv];
        Arrays.fill(parent,-1);
        Arrays.fill(dis,99999);
        bfsDis(g,src,vis,dis,parent);
//        System.out.println();
//        for(int x:dis)
//        System.out.print(x+" ");
        System.out.println();
        List<Integer> dist = new ArrayList<>();
        while(parent[src]!=-1)
        {
            dist.add(parent[src]);
            src = parent[src];
        }
        for(int s:dist)
        {
            System.out.println(s);
        }
    }
    static void dfs(Map<Integer, List<Integer>> g, int u, Set<Integer> vis){
        if(vis.contains(u))
            return;
        // process
        vis.add(u);
        for(int v : g.get(u)){
            dfs(g, v, vis);
        }
    }


    static void bfs(Map<Integer, List<Integer>> g, int s, Set<Integer> vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(s); vis.add(s);

        while(!q.isEmpty()){
            int u  = q.remove();
            // System.out.print(u + " ");
            for(int v : g.get(u)){
                if(!vis.contains(v)){
                    q.add(v); vis.add(v);
                }
            }
        }
    }


    static void bfsDis(Map<Integer, List<Integer>> g, int src, Set<Integer> vis,int[] dis,int[] parent){
        Queue<Integer> q = new LinkedList<>();
        q.add(src); vis.add(src);

        dis[src] = 0;
        parent[src] = -1;
        while(!q.isEmpty()){
            int u  = q.remove();
            // System.out.print(u + " ");
            for(int v : g.get(u)){
                if(!vis.contains(v)){
                    q.add(v); vis.add(v);
                    dis[v]= dis[u]+1;
                    parent[v] = u;
                }
            }
        }
    }
}



//
//package AdjacencyList;
//
//import java.util.*;
//
//public class AdjacencyList{
//    static Scanner sc = new Scanner(System.in);
//    public static void main (String[] args) throws java.lang.Exception{
//        int nv = sc.nextInt(), ne = sc.nextInt();
//
//        Map<Integer, List<Integer>> g = new HashMap<>();
//        for (int i = 0; i < nv; i++) {
//            g.put(i, new ArrayList<>());
//        }
//        for (int i = 0; i < ne; i++) {
//            int u = sc.nextInt(), v = sc.nextInt();
//            g.get(u).add(v);
//            g.get(v).add(u);
//        }
//
//        for(int u : g.keySet()){
//            System.out.print(u + ": ");
//            for(int v : g.get(u))
//                System.out.print(v + " ");
//            System.out.println();
//        }
//        Set<Integer> vis = new HashSet<>();
//        int islandCount = 0;
//        for(int u = 0; u < nv; u++){
//            if(!vis.contains(u)){
//                dfs(g, u, vis);
//                islandCount++;
//            }
//        }
//        System.out.println(islandCount);
//
//    }
//    static void dfs(Map<Integer, List<Integer>> g, int u, Set<Integer> vis){
//        if(vis.contains(u))
//            return;
//        // process
//        vis.add(u);
//        for(int v : g.get(u)){
//            dfs(g, v, vis);
//        }
//    }
//
//
//    static void bfs(Map<Integer, List<Integer>> g, int s, Set<Integer> vis){
//        Queue<Integer> q = new LinkedList<>();
//        q.add(s); vis.add(s);
//
//        while(!q.isEmpty()){
//            int u  = q.remove();
//            // System.out.print(u + " ");
//            for(int v : g.get(u)){
//                if(!vis.contains(v)){
//                    q.add(v); vis.add(v);
//                }
//            }
//        }
//    }
//}
