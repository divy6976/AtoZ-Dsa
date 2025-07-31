class Solution {
   boolean  dfs(int i,int visited[],int path[],int[][]graph){
        visited[i]=1;
        path[i]=1;
        for(int it:graph[i]){
     if(visited[it]!=1){
       if (dfs(it, visited, path, graph)) {
                    return true;
                }
     }else if(path[it]==1){
        return true;
     }
        }
        path[i]=0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
    int n=graph.length;
    int visited[]=new int[n];
    int path[]=new int[n];
    for(int i=0;i<n;i++){
        if(visited[i]!=1){
            dfs(i,visited,path,graph);
        }
    } 
     List<Integer> result=new ArrayList<>();
     for(int i=0;i<n;i++){
        if(path[i]==0){
            result.add(i);
        }
     }
     return result;

    }
}