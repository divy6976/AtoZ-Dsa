class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> ans=new ArrayList<>();

       int i=0;
       int j=0;

       while(i<nums1.length && j <nums2.length){
        if(nums1[i] <= nums2[j]){
            ans.add(nums1[i]);
            i++;

        }else {
            ans.add(nums2[j]);
            j++;
        }
       }

       while(i<nums1.length){
        ans.add(nums1[i]);
        i++;
       }
       while(j<nums2.length){
        ans.add(nums2[j]);
        j++;
       }
       
      if (ans.size() % 2 == 0) {
    int first = ans.size() / 2 - 1;
    int second = ans.size() / 2;

    return ((double) ans.get(first) + ans.get(second)) / 2.0;
}

return (double) ans.get(ans.size() / 2);
        
    }
}