class Solution {

    class Pair{
        int dist;
        int row;
        int col;
        Pair(int dist,int row,int col){
            this.dist=dist;
            this.row=row;
            this.col=col;
        }
    }

    public int minimumEffortPath(int[][] heights) {

        int ans=Integer.MAX_VALUE;

        
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};

        PriorityQueue<Pair> pq=new PriorityQueue<>((Pair x,Pair y)->{
            return x.dist-y.dist;
        });

        int[][] distance=new int[heights.length][heights[0].length];

        for(int i=0;i<distance.length;i++){
            for(int j=0;j<distance[0].length;j++){
                distance[i][j]=Integer.MAX_VALUE;
            }
        }

        distance[0][0]=0;
        pq.offer(new Pair(0,0,0));
        int n=heights.length;
        int m=heights[0].length;

        while(!pq.isEmpty()){
            Pair p=pq.remove();
            int dist=p.dist;
            int row=p.row;
            int col=p.col;
            if(row== n-1 && col == m-1){
                ans=Math.min(dist,ans);
            }

            for(int k=0;k<4;k++){
                int nr=row+dr[k];
                int nc=col+dc[k];
            

                if(nr>=0 && nr<n && nc>=0 && nc<m ){
                        int diff = Math.abs(heights[nr][nc] - heights[row][col]);

                int newdist=Math.max(dist,diff);
                if(newdist < distance[nr][nc]){

                    pq.offer(new Pair(newdist,nr,nc));
                    distance[nr][nc]=newdist;
                }
                }

            }
        }
        return ans;




        
    }
}