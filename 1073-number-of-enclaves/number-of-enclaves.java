class Solution {


   void dfs(int i ,int j,boolean visited[][],int[][] grid,int n,int m){
        visited[i][j]=true;

        int delrow[]={-1,0,+1,0};
        int delcol[]={0,1,0,-1};
        for(int d=0;d<4;d++){
            int nrow=i+delrow[d];
            int ncol=j+delcol[d];
           if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
        grid[nrow][ncol] == 1 && !visited[nrow][ncol]) {
dfs(nrow,ncol,visited,grid,n,m);
        }

    }
   }
    public int numEnclaves(int[][] grid) {
        
        int n =grid.length;
        int m=grid[0].length;
        boolean visited[][]=new boolean[n][m];


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
if ((i == 0 || i == n - 1 || j == 0 || j == m - 1) && grid[i][j] == 1 && !visited[i][j]) {
    dfs(i, j, visited, grid, n, m);
}
            }
        }
        int cnt=0;

for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(grid[i][j]==1 && visited[i][j]!=true){
cnt ++;
        }
    }
}

return cnt;


    }
}