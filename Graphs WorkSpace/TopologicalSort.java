import java.util.*;
public class TopologicalSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nv = sc.nextInt();
        int ne = sc.nextInt();
        Map<Integer,List<Integer>> g = new HashMap<>();
        for(int i=0;i<nv;i++)
            g.put(i,new ArrayList<>());
        for(int i=0;i<ne;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        for(int x:g.keySet())
        {
                System.out.print(x+":");
            for(int u:g.get(x))
            {
                System.out.print(u+" ");
            }
            System.out.println();
        }
        int src = 4;
        Set<Integer> vis = new HashSet<>();
        List<Integer> deadend = new ArrayList<>();

        for (int u : g.keySet()) {
            if (!vis.contains(u)) {
                dfs(g, u, vis, deadend);
            }
        }
        System.out.println("Topological Sort");
        for(int x:deadend)
        {
            System.out.print(x+" ");
        }
    }
    public static void dfs(Map<Integer,List<Integer>> g,int u,Set<Integer> vis,List<Integer> deadend)
    {
        if(vis.contains(u))
            return;
        vis.add(u);
        for(int v:g.get(u)){
            dfs(g,v,vis,deadend);
        }
        deadend.add(u);
    }
}
