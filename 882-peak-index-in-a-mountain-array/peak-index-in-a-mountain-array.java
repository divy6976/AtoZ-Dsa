class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans=0;
        int max=0;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid+1]){
                max=arr[mid];
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }
}