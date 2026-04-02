class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }

       Queue<Integer> q=new LinkedList<>();

       int[] outdegree=new int[graph.length];

        for(int i=0;i<graph.length;i++){
            if(graph[i].length == 0){
               q.offer(i);
            }
            for(int j=0;j<graph[i].length;j++){
                adj.get(graph[i][j]).add(i);
            }
            outdegree[i]=graph[i].length;
        }

        ArrayList<Integer> ans=new ArrayList<>();

        
        while(!q.isEmpty()){
            int num=q.poll();
            ans.add(num);

            for(int neighbour:adj.get(num)){
                outdegree[neighbour]--;
                if(outdegree[neighbour] == 0){
                    q.offer(neighbour);
                }


            }
        }

Collections.sort(ans);
return ans;
    



        
    }
}