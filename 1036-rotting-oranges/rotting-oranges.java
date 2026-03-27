class Solution {

    class Pair{
        int row;
        int col;
        int time;
        Pair(int row,int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;

        }
    }


    public int orangesRotting(int[][] grid) {
        int ans=0;

        Queue<Pair> q=new LinkedList<>();

        boolean[][] visited=new boolean[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j,0));
                    visited[i][j]=true;
                }
            }
        }

        int[] rows={-1,0,1,0};
        int[] cols={0,1,0,-1};
        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty()){
            Pair p=q.poll();
            int row=p.row;
            int col=p.col;
            int time=p.time;
            grid[row][col]=2;
            ans=time;


            for(int k=0;k<4;k++){
                int nr=row+rows[k];
                int nc=col+cols[k];
                

                if(nr >= 0 && nr < n && nc >= 0 && nc < m 
   && !visited[nr][nc] && grid[nr][nc] == 1) {

    q.offer(new Pair(nr, nc, time + 1));
    visited[nr][nc] = true;
}


            }

            

        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans;


        
    }
}