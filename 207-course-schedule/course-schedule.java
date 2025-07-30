class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>(); 
        Queue<Integer> q=new LinkedList<>();
        int n=numCourses;
        int indegree[]=new int[n];
        for(int i=0;i<n;i++){
   adj.add(new ArrayList<>());
        }
for(int[]edge:  prerequisites){
    int u=edge[1];
    int v=edge[0];
    adj.get(u).add(v);
}
for(int i=0;i<n;i++){
    for(int it:adj.get(i)){
indegree[it]++;
    }
}
for(int i=0;i<n;i++ ){
    if(indegree[i]==0){
        q.offer(i);
    }
}
while(!q.isEmpty()){
    int node=q.poll();
    for(int it:adj.get(node)){
        indegree[it]--;
        if(indegree[it]==0){
            q.offer(it);
        }
    }
}
for(int i=0;i<n;i++){
    if(indegree[i]!=0){
        return false;
    }
}
return true;
    }

}