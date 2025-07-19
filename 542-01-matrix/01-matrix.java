class Solution{
    class Pair{
        int row;
        int col;
        int distaance;
        Pair(int row,int col,int distaance){
            this.row=row;
            this.col=col;
            this.distaance=distaance;

        }


    }

    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] visited=new int[n][m];
        int[][] distance=new int[n][m];
        Queue<Pair> q =new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
    q.offer(new Pair(i,j,0));
    visited[i][j]=1;
                }
            }
        }
        int delrow[]={-1,0,+1,0};
        int delcol[]={0,1,0,-1};

        while(!q.isEmpty()){
Pair p=q.poll();
int r=p.row;
int c=p.col;
int dis=p.distaance;
distance[r][c]=dis;
for(int i=0;i<4;i++){
int nrow=r+delrow[i];
int ncol=c+delcol[i];
if(nrow>=0 && nrow< n && ncol>=0 && ncol<m && visited[nrow][ncol]==0){
    visited[nrow][ncol]=1;
    q.offer(new Pair(nrow,ncol,dis+1));
}
}

        }
return distance;
    }
}