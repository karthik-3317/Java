import java.util.*;

class Pos{
    int i, j;
    public Pos(int i, int j){
        this.i = i;
        this.j = j;
    }
}
public class BfsTraversal{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int r = sc.nextInt(), c = sc.nextInt(), si = sc.nextInt(), sj = sc.nextInt();
        int[][] m = new int[r][c]; // 0

        bfs(m, si, sj);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }

    }
    static void bfs(int[][] m, int i, int j){
        int r = m.length, c = m[0].length;
        Queue<Pos> q = new LinkedList<>();
        q.add(new Pos(i, j));
        m[i][j] = -1; // -1 means visited
        int counter = 1;

        int[] di = {-1, 0, +1, 0};
        int[] dj = {0, 1, 0, -1};

        while(!q.isEmpty()){
            Pos f = q.remove();
            m[f.i][f.j] = counter++;

            for(int x=0; x<4; x++){
                int ni = f.i + di[x];
                int nj = f.j + dj[x];
                if(ni>=0 && nj>=0 && ni<r && nj<c && m[ni][nj] == 0){
                    q.add(new Pos(ni, nj));
                    m[ni][nj] = -1;
                }
            }
            /* 
            // North
            int ni = f.i-1, nj = f.j;
            if(ni>=0 && nj>=0 && ni<r && nj<c && m[ni][nj] == 0){
                q.add(new Pos(ni, nj));
                m[ni][nj] = -1;
            }

            // E
            ni = f.i; nj = f.j + 1;
            if(ni>=0 && nj>=0 && ni<r && nj<c && m[ni][nj] == 0){
                q.add(new Pos(ni, nj));
                m[ni][nj] = -1;
            }

            // S
            ni = f.i + 1; nj = f.j;
            if(ni>=0 && nj>=0 && ni<r && nj<c && m[ni][nj] == 0){
                q.add(new Pos(ni, nj));
                m[ni][nj] = -1;
            }

            // W
            ni = f.i; nj = f.j - 1;
            if(ni>=0 && nj>=0 && ni<r && nj<c && m[ni][nj] == 0){
                q.add(new Pos(ni, nj));
                m[ni][nj] = -1;
            }
            */
        }
    }

}
