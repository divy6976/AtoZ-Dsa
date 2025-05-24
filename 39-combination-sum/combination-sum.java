class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     
      List<List<Integer>> result=new ArrayList<>();
      Arrays.sort(candidates);
        ArrayList<Integer> current=new ArrayList<>();

combination(candidates,target,result,current,0);
return result;
    }
  void  combination(int[] candidates,int target,List<List<Integer>> result,ArrayList<Integer> current,int ind){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(candidates[i]>target) break;
            current.add(candidates[i]);
            combination(candidates,target-candidates[i],result,current,i);
            current.remove(current.size()-1);

        }
    }
}