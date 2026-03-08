class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          
          HashMap<Integer,Integer> mpp=new HashMap<>();
          HashMap<Integer,Integer> mpps=new HashMap<>();
            for(int i=0;i<nums1.length;i++){
                mpp.put(nums1[i],mpp.getOrDefault(nums1[i],0)+1);
            }
            for(int i=0;i<nums2.length;i++){
              mpps.put(nums2[i],mpp.getOrDefault(nums2[i],0)+1);
            }
            HashSet<Integer> st=new HashSet<>();

            for(int i=0;i<nums1.length;i++){
                if(mpp.containsKey(nums1[i]) && mpps.containsKey(nums1[i])){
                    st.add(nums1[i]);
                }
            }
            for(int i=0;i<nums2.length;i++){
                  if(mpp.containsKey(nums2[i]) && mpps.containsKey(nums2[i])){
                    st.add(nums2[i]);
                }

            }
            int[] ans=new int[st.size()];
            int i=0;
            for(int str:st){
                ans[i]=str;
                i++;
            }
        return ans;
    }
}