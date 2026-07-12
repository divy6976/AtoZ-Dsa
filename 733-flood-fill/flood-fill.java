class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        Queue<Pair> q=new LinkedList<>();
boolean[][] visited=new boolean[image.length][image[0].length];

int original=image[sr][sc];

        q.offer(new Pair(sr,sc));
        image[sr][sc]=color;
        visited[sr][sc]=true;
 int dr[]={-1,0,1,0};
 int dc[]={0,1,0,-1};
        while(!q.isEmpty()){
            Pair p=q.poll();
            int  row=p.row;
            int col=p.col;


            for(int k=0;k<4;k++){
                int nr=row+dr[k];
                int nc=col+dc[k];
                if(nr>=0 && nr< image.length && nc>=0 && nc<image[0].length && image[nr][nc]==original    && !visited[nr][nc]){
                    q.offer(new Pair(nr,nc));
                    visited[nr][nc]=true;
                    image[nr][nc]=color;
                }
            }

        }
        return image;
    }
}