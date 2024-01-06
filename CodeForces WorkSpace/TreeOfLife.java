import java.util.*;
public class TreeOfLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,List<Integer>> g = new HashMap<>();
        int nv = sc.nextInt();
        int ne = sc.nextInt();
        for(int i=0;i<nv;i++)
        {
           g.put(i,new ArrayList<>());
        }
        for(int i=0;i<ne;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.get(u).add(v);
        }
        for(int u:g.keySet())
        {
            for(int v:g.get(u))
            {
                System.out.print(u+" ");
            }
            System.out.println();
        }
    }
}
