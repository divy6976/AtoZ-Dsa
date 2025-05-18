class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list= new ArrayList<>();
Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
        
        while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
            dq.removeLast();
        }
       dq.addLast(i);

        if(i>=k-1){
            list.add(nums[dq.peekFirst()]);
        }



        }
        int ans[]=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}