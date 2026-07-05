class Solution {
    public int[][] merge(int[][] intervals) {


       Arrays.sort(intervals, (a, b) -> {
    return a[0] - b[0];
});

        int start=intervals[0][0];
        int end=intervals[0][1];

        List<int[]> list=new ArrayList<>();

        for(int i=1;i<intervals.length;i++){
            int a=intervals[i][0];
            int b=intervals[i][1];

            if( a <= end && start <= b ){

                end=Math.max(end,b);       
         }else if(a<=end && start > b){
            start=Math.min(start,a);
            end=Math.max(end,b);
         }else if(a > end){
            list.add(new int[]{start,end});
            start=a;
            end=b;

         }
        }
        list.add(new int[]{start,end});
        int[][] ans=new int[list.size()][2];
        for(int i=0;i<ans.length;i++){
            ans[i][0]=list.get(i)[0];
            ans[i][1]=list.get(i)[1];
        }
        return ans;
    }
}

