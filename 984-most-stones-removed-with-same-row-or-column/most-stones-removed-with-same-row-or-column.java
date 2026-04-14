class Solution {

  void   dfs(int index,boolean[] visited,int[][] stones){
        visited[index]=true;

        for(int i=0;i<stones.length;i++){
            int row=stones[i][0];
            int col=stones[i][1];

            if(visited[i]== false  ){
                if(row == stones[index][0] || col == stones[index][1]){
                    dfs(i,visited,stones);
                }
            }
        }
    }


    public int removeStones(int[][] stones) {

       int n=stones.length;
       int cnt=0;
       boolean[] visited=new boolean[n];
       for(int i=0;i<n;i++){
        if(!visited[i]){
            dfs(i,visited,stones);
            cnt ++;
        }
       }

       return n-cnt;
        
    }
}