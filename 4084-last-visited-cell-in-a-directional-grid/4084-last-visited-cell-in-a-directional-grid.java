class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int r =0;
        int c=0;
        boolean[][] visited = new boolean[m][n];
        visited[0][0]=true;
        while(true){
            int nr=r, nc=c;
            char ch = grid[r][c];
            if(ch == 'R'){
                nc++;
            }else if(ch == 'L'){
                nc--;
            }else if(ch == 'U'){
                nr--;
            }else{
                nr++;
            }
            if(nr<0 || nr>=m || nc<0 || nc>=n || visited[nr][nc]){
                break;
            }
            r=nr;
            c=nc;
            visited[r][c]=true;
        }
        return new int[]{r,c};
    }
}