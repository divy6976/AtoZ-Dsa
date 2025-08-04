class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int m = j + 1;
                int n = nums.length - 1;

                while (m < n) {
                    long sum = (long) nums[i] + nums[j] + nums[m] + nums[n]; // overflow fix

                    if (sum == target) {
                        // ✅ new sublist every time
                        List<Integer> sublist = new ArrayList<>();
                        sublist.add(nums[i]);
                        sublist.add(nums[j]);
                        sublist.add(nums[m]);
                        sublist.add(nums[n]);
                        result.add(sublist);

                        m++;
                        n--;

                        // ✅ skip duplicates
                        while (m < n && nums[m] == nums[m - 1]) m++;
                        while (m < n && nums[n] == nums[n + 1]) n--;

                    } else if (sum < target) {
                        m++;
                    } else {
                        n--;
                    }
                }
            }
        }

        return result;
    }
}
