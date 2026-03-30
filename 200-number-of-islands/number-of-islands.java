class Solution {

    class Pair{
        int rows;
        int cols;
        Pair(int rows,int cols){
            this.rows=rows;
            this.cols=cols;

        }
    }


    void bfs(char[][] grid,boolean[][] visited,int i,int j){
        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};

        Queue<Pair> q=new LinkedList<>();

        q.offer(new Pair(i,j));
        visited[i][j]=true;
        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty()){
            Pair p=q.poll();
            int rows=p.rows;
            int cols=p.cols;

            for(int k=0;k<4;k++){
                int nr=rows + row[k];
                int nc=cols+ col[k];
                if(nr >=0 && nr <n && nc >=0 && nc <m && visited[nr][nc]== false && grid[nr][nc]=='1'){
                    q.offer(new Pair(nr,nc));
                    visited[nr][nc]=true;
                }
            }
        }



        
    }



    public int numIslands(char[][] grid) {
        int cnt=0;

        boolean[][] visited=new boolean[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visited[i][j]== false){
                    cnt++;
                    bfs(grid,visited,i,j);
                }
            }
        }

        return cnt;
        
    }
}



