class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[graph.length];
        int k=0;

        for(int [] arr:graph){
          

            for(int m=0;m<arr.length;m++){
           adj.get(arr[m]).add(k);   // reverse edge
indegree[k]++;  
            }

           

            k++;
           
          
        }
 List<Integer> ans=new ArrayList<>();

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<indegree.length;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int num=q.poll();
            ans.add(num);
            for(int neighbour:adj.get(num)){
                indegree[neighbour]--;
                if(indegree[neighbour] == 0){
                    q.offer(neighbour);
                } 
            }
        }

           Collections.sort(ans);
           return ans;

        
    }
}