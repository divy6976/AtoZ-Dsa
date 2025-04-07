class Solution {
     public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
           
            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.removeFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }

            dq.addLast(i);

    
            if (i >= k - 1) {
                result.add(nums[dq.peekFirst()]);
            }
        }


        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}