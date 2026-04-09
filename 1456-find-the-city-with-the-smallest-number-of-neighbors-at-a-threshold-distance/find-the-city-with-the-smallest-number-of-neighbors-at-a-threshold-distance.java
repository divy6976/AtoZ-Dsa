class Solution {

    class Pair{
        int num;
        int dist;
        Pair(int dist,int num){
           
            this.dist=dist;
             this.num=num;
        }
    }

    void floyd(int row,int[] freq,ArrayList<ArrayList<Pair>> adj,int distance){
        PriorityQueue<Pair> pq=new PriorityQueue<>((Pair x,Pair y) ->{
            return x.dist-y.dist;
        });
        int[] visited=new int[freq.length];
        for(int i=0;i<visited.length;i++){
            visited[i]=Integer.MAX_VALUE;
        }
        int cnt=0;
        boolean[] check=new boolean[freq.length];

        pq.offer(new Pair(0,row));
        visited[row]=0;
        check[row]=true;

        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int dist=p.dist;

            int num=p.num;
            
            if(!check[num]){
                cnt ++;
                check[num]=true;
            }
            for(Pair d:adj.get(num)){
                int weight=d.dist;
                int node=d.num;
                int newdist=weight+dist;
                
                if(newdist <= distance && newdist < visited[node]){
                  
                    pq.offer(new Pair(newdist,node));
                    visited[node]=newdist;
                }
            }
        }
        freq[row]=cnt-1;

    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        
    ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
    int[] freq=new int[n];
    for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
    }

    for(int[] edge:edges){
        int u=edge[0];
        int v=edge[1];
        int w=edge[2];

        adj.get(u).add(new Pair(w,v));
        adj.get(v).add(new Pair(w,u));

    }
    int distance=distanceThreshold;

    for(int i=0;i<n;i++){
        floyd(i,freq,adj,distanceThreshold);
    }

    int mini=Integer.MAX_VALUE;
    int ans=0;
    for(int i=0;i<freq.length;i++){
        if(freq[i] <= mini){
            mini=freq[i];
            ans=Math.max(ans,i);
        }
    }

  return ans;



       

        
    }
}