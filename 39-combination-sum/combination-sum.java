class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          List<List<Integer>> result=new ArrayList<>();
        ArrayList<Integer> current=new ArrayList<>();
      generatecombination(candidates,target,current,0,result);
      return result;
    }
  private void generatecombination(int[] candidates, int target, ArrayList<Integer> current,int i,List<List<Integer>> result){
        if(i==candidates.length){
            if(target==0){
  result.add(new ArrayList<>(current));
 
            }
            return;
        }
        if(candidates[i]<=target){
            current.add(candidates[i]);
          
            generatecombination(candidates, target-candidates[i],current,i,result);
            current.remove(current.size()-1);
        }
        
             generatecombination(candidates,target,current,i+1,result);
        
    }
}