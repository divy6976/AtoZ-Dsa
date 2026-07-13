class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        if(prerequisites.length == 0){
            return true;
        }


        int[] indegree=new int[numCourses];

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        

        for(int[] arr:prerequisites){
            int a=arr[0];
            int b=arr[1];

            adj.get(b).add(a);


            indegree[a] ++;
        }



        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<indegree.length;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int num=q.poll();
            
            for(int neighbour:adj.get(num)){
                indegree[neighbour] --;
                if(indegree[neighbour]  == 0){
                    q.offer(neighbour);
                }
            }


        }

        for(int i=0;i<indegree.length;i++){
            if(indegree[i] > 0){
                return false;
            }
        }


   return true;
        
        
    }
}