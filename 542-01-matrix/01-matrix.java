class Solution {

    class Pair{
        int row;
        int col;
        int dist;
        Pair(int row,int col,int dist){
            this.row=row;
            this.col=col;
            this.dist=dist;
        }
    }



    public int[][] updateMatrix(int[][] mat) {

        int[][] ans=new int[mat.length][mat[0].length];

        Queue<Pair> q= new LinkedList<>();

        boolean[][] visited=new boolean[mat.length][mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(visited[i][j] == false && mat[i][j]==0){
                    q.offer(new Pair(i,j,0));
                    visited[i][j]=true;
                }
            }
        }

        int rows[]={-1,0,1,0};
        int cols[]={0,1,0,-1};

        int n=mat.length;
        int m=mat[0].length;

        while(!q.isEmpty()){
            Pair p=q.poll();

            int row=p.row;
            int col=p.col;
            int dist=p.dist;
            ans[row][col]=dist;

            for(int k=0;k<4;k++){
                int nr=row+rows[k];
                int nc=col+cols[k];

                if(nr>=0 && nr<n && nc>=0 && nc<m && visited[nr][nc]==false && mat[nr][nc]==1 ){
                    q.offer(new Pair(nr,nc,dist+1));
                    visited[nr][nc]=true;

                }


            }
        }
        return ans;

        
    }
}