class Solution {

   void bfs(int i,boolean[] visited,ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q=new LinkedList<>();
        q.offer(i);
        visited[i]=true;

        while(!q.isEmpty()){
            int num=q.poll();
            for(int neighbour:adj.get(num)){
                if(!visited[neighbour]){
                    visited[neighbour]= true;
                    q.offer(neighbour);
                }
            }
        }




    }
    public int makeConnected(int n, int[][] connections) {

        int edge=0;

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] conn:connections){
            int u=conn[0];
            int v=conn[1];
            edge++;
            adj.get(u).add(v);
            adj.get(v).add(u);


        }
        int cnt =0;
        boolean[] visited=new boolean[n];

        for(int i=0;i<n;i++){
            
            if(visited[i] == false){
                cnt ++;
                bfs(i,visited,adj);
            }
        } 
        if(edge <n-1){
            return -1;
        }
        return cnt-1;

        
    }
}