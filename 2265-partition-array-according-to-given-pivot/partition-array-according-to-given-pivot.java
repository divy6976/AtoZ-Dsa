class Solution {
public int[] pivotArray(int[] nums, int pivot) {

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] < pivot) {
            list1.add(nums[i]);
        } else if (nums[i] == pivot) {
            list2.add(nums[i]);
        } else {
            list3.add(nums[i]);
        }
    }

    int[] ans = new int[nums.length];
    int idx = 0;

    for (int x : list1) ans[idx++] = x;
    for (int x : list2) ans[idx++] = x;
    for (int x : list3) ans[idx++] = x;

    return ans;
}
}