class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<Integer> ans = new ArrayList<>();

        if(prerequisites.length == 0 ){
            
            for(int i=0;i<numCourses;i++){
                ans.add(i);
            }
            Collections.reverse(ans);
            int[] arr=new int[ans.size()];
            for(int i=0;i<arr.length;i++){
                arr[i]=ans.get(i);
            }

            return arr;
        }

        ArrayList<ArrayList<Integer> > adj=new ArrayList<>();
        int[] indegree=new int[numCourses];

        for(int i=0;i<indegree.length;i++){
            adj.add(new ArrayList());
        }

        for(int [] edge:prerequisites){
            int u=edge[0];
            int v=edge[1];
            indegree[u] ++;
            adj.get(v).add(u);

        }

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
                if(indegree[neighbour] ==0){
                    q.offer(neighbour);
                }
            }
        }



        int[] arr=new int[ans.size()];

        for(int i=0;i<indegree.length;i++){
            if(indegree[i] >0){
              return new int[0];
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=ans.get(i);
        }
        return arr;


        
    }
}