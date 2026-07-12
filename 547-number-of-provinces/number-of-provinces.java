class Solution {

    void bfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int i){
        Queue<Integer> q=new LinkedList<>();

        q.offer(i);
        while(!q.isEmpty()){
            int num=q.poll();
            visited[num]=true;

            for(int neighbour:adj.get(num)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.offer(neighbour);
                }
            }
        }
    }


    public int findCircleNum(int[][] isConnected) {

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
              if(isConnected[i][j] == 1 && i!=j){
                adj.get(i).add(j);
              }
            }
        }

        boolean[] visited=new boolean[isConnected.length];
        int cnt=0;

        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                cnt ++;
                bfs(adj,visited,i);
            }
        }

        return cnt;
    }
}