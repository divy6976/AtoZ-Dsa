class Solution {
    public List<List<Integer>> generate(int numRows) {


        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> sublist=new ArrayList<>();

            if(i==0){

                sublist.add(1);           

            }else if(i==1){
                sublist.add(1);
                sublist.add(1);

            }else {
                List<Integer> compare=ans.get(ans.size()-1); 
               for(int k=0;k<compare.size();k++){
                if(k==0){
                    sublist.add(1);
                }else {
                    sublist.add(compare.get(k)+compare.get(k-1));
                }
               }
               sublist.add(1);
            }


ans.add(new ArrayList<>(sublist));
        }
        return ans;
        
    }
}