import java.util.*;
public class Dsu {
    int[] parent;
    int[] rank;
    public Dsu(int n){
      parent = new int[n];
      rank = new int[n];
      for(int i=0;i<n;i++){
          parent[i] = i;
      }
    }
    public int find(int x){
        if(parent[x]==x){
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    public boolean union(int x,int y) {
        int xset = find(x);
        int yset = find(y);
        if (xset != yset) {
            if (rank[xset] < rank[yset]) {
                parent[xset] = yset;
            } else {
                parent[yset] = xset;
            }
            if (rank[xset] == rank[yset]) {
                rank[xset]++;
            }
            return true;
        }
        return false;
    }
}
