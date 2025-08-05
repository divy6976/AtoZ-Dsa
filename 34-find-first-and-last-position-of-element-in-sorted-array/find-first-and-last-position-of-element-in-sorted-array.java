class Solution {

    int start;
    int end;

    public int[] searchRange(int[] nums, int target) {
        start = -1;
        end = -1;
        int[] ans = new int[2];

        bsstart(nums, target);
        bsend(nums, target);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    void bsstart(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                start = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    void bsend(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                end = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
