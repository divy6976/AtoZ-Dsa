class Solution {
    public List<List<Integer>> generate(int numRows) { 

        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            ArrayList<Integer> sublist=new ArrayList<>();
            if(i==0){
                sublist.add(1);

            }else if(i==1){
                sublist.add(1);
                sublist.add(1);
            }else {
                sublist.add(1);

                List<Integer> prev=ans.get(ans.size()-1);
                for(int m=0;m<prev.size()-1;m++){
                    sublist.add(prev.get(m) + prev.get(m+1));
                }
                sublist.add(1);
            }


            ans.add(new ArrayList<>(sublist));
        }
        return ans;


        
    }
}