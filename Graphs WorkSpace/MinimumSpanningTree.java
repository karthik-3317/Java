import java.util.*;

class UFDS{
    int[] p;
    int[] sz;
    int n, i_c;

    public UFDS(int n){
        this.n = n;
        this.i_c = n;
        p = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i; sz[i] = 1;
        }
    }

    int find(int x){
        if(x == p[x]) return x;
        return p[x] = find(p[x]); // Path Compresssion
    }

    boolean merge(int x, int y){
        int lx = find(x), ly = find(y);
        if(lx == ly) return false;
        // union by size
        if(sz[lx] >= sz[ly]){
            p[ly] = lx;
            sz[lx] += sz[ly];
        } else {
            p[lx] = ly;
            sz[ly] += sz[lx];
        }
        return true;
    }

}


class Edge{
    int u, v, w;

    public Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    @Override
    public String toString() {
        return u+" "+v+" "+w;
    }
}
class MinimumSpanningTree{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nv = sc.nextInt(), ne = sc.nextInt();
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < ne; i++) {
            char u = sc.next().charAt(0), v = sc.next().charAt(0);
            int w = sc.nextInt();
            Edge e = new Edge(u-'a', v-'a', w);
            edges.add(e);
        }
        Collections.sort(edges, (e1, e2)->{
            return e1.w - e2.w;
        });
        int minimalPath = 0;
        List<Edge> path = new ArrayList<>();
        UFDS g = new UFDS(nv);
        for(Edge e : edges){
            System.out.println(e.u + " " + e.v + " " + e.w);
            if(g.merge(e.u,e.v)) {
                path.add(e);
                minimalPath += e.w;
            }
        }
        System.out.println(path);
        System.out.println(minimalPath);
    }
}
