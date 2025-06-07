class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
   List<List<Integer>>  result=new ArrayList<>();
        ArrayList<Integer> current=new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates,target,0,result,current);
        return result;
    }
  void  combination(int[] candidates,int target,int ind,   List<List<Integer>>  result,     ArrayList<Integer> current){
        
if(target==0){
    result.add(new ArrayList<>(current));
    return;
}
for(int i=ind;i<candidates.length;i++){
    if(i>ind && candidates[i]==candidates[i-1]) continue;
    if(candidates[i]>target) break;
    current.add(candidates[i]);
    combination(candidates,target-candidates[i],i+1,result,current);
    current.remove(current.size()-1);
}



    }
}