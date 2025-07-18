class Solution {
    
    int size=0;
 int [] visited;

 void dfs(int node,int[][] isConnected){
 visited[node]=1;
 
 for(int j=0;j<isConnected.length;j++){
  if(isConnected[node][j]==1){
    if(visited[j]!=1){
        dfs(j,isConnected);
    }
  }
 }

 }



    public int findCircleNum(int[][] isConnected) {
        visited=new int[isConnected.length];
        for(int i=0;i<isConnected.length;i++){

            if(visited[i]!=1){
                size+=1;
                dfs(i,isConnected);
            }
        }
        return size;
    }
}