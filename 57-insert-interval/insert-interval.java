class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
         List<int[]> ans = new ArrayList<>();
        int i=0;
        int n=intervals.length;
      while (i < n && intervals[i][1] < newInterval[0]) {
        ans.add(intervals[i]);
        i++;
    }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i=i+1;

        }
        ans.add(newInterval);

        while(i<n ){
            ans.add(intervals[i]);
            i=i+1;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}