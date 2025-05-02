class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int cnt=0;
        int overlap[]=intervals[0];
        for(int i=1;i<intervals.length;i++){
if(intervals[i][0]<overlap[1]){
    cnt ++;
    
}else{
    overlap=intervals[i];
}
        }
        
        return cnt;

    }
}