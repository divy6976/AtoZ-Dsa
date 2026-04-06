class Solution {
    class Pair{
        int node;
        int dist;
        Pair(int dist,int node){
                       this.dist=dist;
                        this.node=node;
        }
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {

        int ans =0;

        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();

        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }

        for(int []time:times){
            int u=time[0];
            int v=time[1];
            int w=time[2];
            adj.get(u).add(new Pair(w,v));
        }

       PriorityQueue<Pair> pq = new PriorityQueue<>(
    (a, b) -> a.dist - b.dist
);

        int[] visited=new int[n+1];
        for(int i=0;i<visited.length;i++){
            visited[i]=Integer.MAX_VALUE;
        }
        visited[k]=0;
        pq.offer(new Pair(0,k));

        while(!pq.isEmpty()){
            Pair p=pq.remove();
            int num=p.node;
            int time=p.dist;
          

            for(Pair q:adj.get(num)){
                int node=q.node;
                int distance=q.dist;
                int newtime=distance+time;
                if(newtime < visited[node]){
                    visited[node]=newtime;
                    pq.offer(new Pair(newtime,node));
                }
            }

            
        }
        for(int i=1;i<visited.length;i++){
            if(visited[i] == Integer.MAX_VALUE){
                return -1;
            }
            ans=Math.max(ans,visited[i]);
        }
        return ans;
        
    }
}