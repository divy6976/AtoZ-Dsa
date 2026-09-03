class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
  HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
st.add(arr[i]);
        }
    ArrayList<Integer> sorted=new ArrayList<>();
        int k=0;
       for(int s:st){
        sorted.add(s);
       }


        Collections.sort(sorted);
        
        int l=0;
        int r=0;
        int maxi=1;
        
        while(r<sorted.size()){
             if(l==r){
                 r++;
                 continue;
             }
           
             if((sorted.get(r)- sorted.get(r-1)) ==1 ){
                 maxi=Math.max(maxi,r-l+1);
             }else {
                 l=r;
             }
         r++;
        }
       
        return maxi;
        
    }
}