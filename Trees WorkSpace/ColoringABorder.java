public class ColoringABorder {

    static class Solution{
        public int[][] colorBorder(int[][] grid,int row,int col,int color)
        {
            colorcorner(grid,row,col,color);
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] < 0)
                        grid[i][j] = color;
                }
            }
            return grid;
        }
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        public void colorcorner(int[][] grid,int row,int col,int color)
        {
            grid[row][col] = -color;
            int count = 0;
            for(int i=0;i<4;i++)
            {
                int newrow = row + directions[i][0];
                int colrow = col + directions[i][1];

                if(newrow < 0 || colrow < 0 || newrow >=grid.length || colrow >=grid[0].length || Math.abs(grid[newrow][colrow]) !=color)
                {
                    continue;
                }
                count++;
                if(grid[newrow][colrow] == color)
                {
                    colorcorner(grid,newrow,colrow,color);
                }
                if(count == 4)
                {
                    grid[row][col] = color;
                }
            }
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{1,1},{1,2}};
        int row = 0;
        int col = 0;
        int color = 3;
        int[][] result = solution.colorBorder(grid, row, col, color);
    }
}
