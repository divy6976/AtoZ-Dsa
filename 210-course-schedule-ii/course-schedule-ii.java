class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int []result=new int[numCourses];
        int n=numCourses;
int indegree[]=new int[n];
List<List<Integer>> adj=new ArrayList<>();
List<Integer> ans=new ArrayList<>();
Queue<Integer> q=new LinkedList<>();
for(int i=0;i<n;i++){
    adj.add(new ArrayList<>());

}
for(int[]edge: prerequisites){
    int u=edge[1];
    int v=edge[0];
    adj.get(u).add(v);

}
for(int i=0;i<n;i++){
    for(int it:adj.get(i)){
        indegree[it]++;
    }
}
for(int i=0;i<n;i++){
    if(indegree[i]==0){
        q.offer(i);
    }
}
while(!q.isEmpty()){
    int node=q.poll();
 ans.add(node);
 for(int it:adj.get(node)){
    indegree[it]--;
    if(indegree[it]==0){
        q.offer(it);
    }
 }
}
if (ans.size() != numCourses) {
    return new int[0]; // cycle exists
}

for (int i = 0; i < numCourses; i++) {
    result[i] = ans.get(i);
}

      
return result;
    }
}