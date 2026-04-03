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


    public int shortestPathBinaryMatrix(int[][] grid) {

        boolean [][] visited=new boolean[grid.length][grid[0].length];

        Queue<Pair> q=new LinkedList<>();

        if(grid[0][0] == 1){
            return -1;
        }

        q.offer(new Pair(0,0,1));
        visited[0][0]=true;

        int[] dr = {-1,-1,-1, 0, 0, 1, 1, 1};
      int[] dc = {-1, 0, 1,-1, 1,-1, 0, 1};
     int n=grid.length;
      int m=grid[0].length;

        while(!q.isEmpty()){
            Pair p=q.poll();
            int row=p.row;
            int col=p.col;
            int dist=p.dist;

            if(row == n-1 && col == m-1){
                return dist;
            }

            for(int k=0;k<8;k++){
                int nr=row+dr[k];
                int nc=col+dc[k];
             
               if(nr >=0 && nr <n && nc >=0 && nc< m && grid[nr][nc] ==0 && visited[nr][nc] == false){

                q.offer(new Pair(nr,nc,dist+1));
                visited[nr][nc]=true;



               }
            }

            
        }


        return -1;







        
    }
}