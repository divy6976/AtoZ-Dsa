class Solution {
    int delrow[]={-1,0,+1,0};
    int delcol[]={0,1,0,-1};


void dfs(int i ,int j ,boolean visited[][],char[][] board,int n,int m){
    visited[i][j]=true;
    for(int d=0;d<4;d++){
        int nrow=i+delrow[d];
        int ncol=j+delcol[d];
        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !visited[nrow][ncol] &&  board[nrow][ncol]=='O'){
dfs(nrow,ncol,visited,board,n ,m);
        }
    }

}
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    if(board[i][j]=='O' && visited[i][j]!=true){
                        dfs(i,j,visited,board,n,m);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
if(board[i][j]=='O' && visited[i][j]!=true){
    board[i][j]='X';
}
            }
        }
    }
}