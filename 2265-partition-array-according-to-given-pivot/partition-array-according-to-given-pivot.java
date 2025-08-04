class Solution {


    public int[] pivotArray(int[] nums, int pivot) {
    int n = nums.length;
    int[] ans = new int[n];
    int idx = 0;

    // 1st loop: Elements less than pivot
    for (int i = 0; i < n; i++) {
        if (nums[i] < pivot) {
            ans[idx++] = nums[i];
        }
    }

    // 2nd loop: Elements equal to pivot
    for (int i = 0; i < n; i++) {
        if (nums[i] == pivot) {
            ans[idx++] = nums[i];
        }
    }

    // 3rd loop: Elements greater than pivot
    for (int i = 0; i < n; i++) {
        if (nums[i] > pivot) {
            ans[idx++] = nums[i];
        }
    }

    return ans;
}

}
