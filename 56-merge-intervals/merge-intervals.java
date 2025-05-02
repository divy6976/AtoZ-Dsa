class Solution {

    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
     
int overlap[]=intervals[0];
for(int i=0;i<intervals.length;i++){
    if(intervals[i][0]<=overlap[1]){
        overlap[1]=Math.max(intervals[i][1],overlap[1]);
    }else{
        ans.add(overlap);
      overlap=intervals[i];
    }
}
ans.add(overlap);

return ans.toArray(new int[ans.size()][]);
    }
}