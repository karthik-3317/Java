import java.util.*;

public class MinimumPathSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int paths[][] = new int[size][size];
        int helperMatrix[][] = new int[size][size];
        for(int i=0;i<size;i++){
            Arrays.fill(helperMatrix[i],Integer.MAX_VALUE);
        }
        dfs(size-1,0,paths,helperMatrix,paths[size-1][0],size,size);
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(helperMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int dir_x[] = {-1,0,+1,0};
    static int dir_y[] = {0,+1,0,-1};
    public static void dfs(int currX,int currY,int[][] paths,int[][] helperMatrix, int currSum,int Row,int Col){
            helperMatrix[currX][currY] = currSum;

            for(int i=0;i<4;i++) {
                int ndX = dir_x[i] + currX;
                int ndY = dir_y[i] + currY;
                if (ndX < 0 || ndY < 0 || ndY >= Col || ndX >= Row || helperMatrix[ndX][ndY] <= currSum + paths[ndX][ndY]) {
                    return;
                }
                dfs(ndX, ndY, paths, helperMatrix, currSum + paths[ndX][ndY], Row, Col);
            }
    }
}
