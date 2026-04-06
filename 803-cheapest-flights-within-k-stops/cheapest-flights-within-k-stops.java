class Solution {

    class Pair{
        int distance;
        int node;
        int steps;
        Pair(int distance,int node,int steps){
            this.distance=distance;
            this.node=node;
            this.steps=steps;
        }
    }

    class Pairq{
        int num;
        int duri;
        Pairq(int num,int duri){
            this.num=num;
            this.duri=duri;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)-> x.distance-y.distance);

        ArrayList<ArrayList<Pairq>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int[] f:flights){
            adj.get(f[0]).add(new Pairq(f[1],f[2]));
        }

      
        int[][] visited = new int[n][k+2];
        for(int[] row: visited){
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        pq.offer(new Pair(0,src,0));
        visited[src][0]=0;

        while(!pq.isEmpty()){
            Pair p=pq.poll();

            int dist=p.distance;
            int node=p.node;
            int steps=p.steps;

            if(node==dst) return dist;

            if(steps > k) continue;

            for(Pairq d:adj.get(node)){
                int next=d.num;
                int newdist=dist + d.duri;

                
                if(newdist < visited[next][steps+1]){
                    visited[next][steps+1]=newdist;
                    pq.offer(new Pair(newdist,next,steps+1));
                }
            }
        }

        return -1;
    }
}