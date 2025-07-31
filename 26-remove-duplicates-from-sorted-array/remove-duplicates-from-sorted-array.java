class Solution {
    public int removeDuplicates(int[] nums) {
Set<Integer> st = new LinkedHashSet<>();
for (int num : nums) st.add(num);

int i = 0;
for (int val : st) {
    nums[i++] = val;
}

return st.size();

    }
}