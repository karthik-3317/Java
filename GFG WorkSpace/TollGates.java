import java.util.*;

public class TollGates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int dpRec[][] = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                dpRec[i][j] = sc.nextInt();
            }
        }

        for (int j = 1; j < col; j++) {
            for (int i = 0; i < rows; i++) {
                int left = dpRec[i][j - 1];
                int topLeft = (i - 1 >= 0) ? dpRec[i - 1][j - 1] : Integer.MAX_VALUE;
                int bottomLeft = (i + 1 < rows) ? dpRec[i + 1][j - 1] : Integer.MAX_VALUE;
                dpRec[i][j] += Math.min(left, Math.min(topLeft, bottomLeft));
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(dpRec[i][j] + " ");
            }
            System.out.println();
        }
    }
}
