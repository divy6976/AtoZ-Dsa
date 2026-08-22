class Solution {
    public int nearestDrone(int[][] drones, int[] target) {

        int maxi=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++){
            int first=drones[i][0];
            int second=drones[i][1];
            int third=drones[i][2];
 

    int firstdiff=Math.abs(first- target[0]);
    int seconddiff=Math.abs(second-target[1]);
    int sum = firstdiff+seconddiff;
    if(sum <maxi && sum <= third){
ans=i;
maxi=sum;
    }else if(sum == maxi){
        ans=Math.min(ans,i);
    }


        }

        if(ans == Integer.MAX_VALUE){
            return -1;
        }

        return ans;
        
    }
}