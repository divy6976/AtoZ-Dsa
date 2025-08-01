class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            List<Integer> pair = new ArrayList<>();

            if (nums1[i][0] == nums2[j][0]) {
                pair.add(nums1[i][0]);
                pair.add(nums1[i][1] + nums2[j][1]);
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                pair.add(nums1[i][0]);
                pair.add(nums1[i][1]);
                i++;
            } else {
                pair.add(nums2[j][0]);
                pair.add(nums2[j][1]);
                j++;
            }

            result.add(pair);
        }

        // Handle remaining elements in nums1
        while (i < nums1.length) {
            List<Integer> pair = new ArrayList<>();
            pair.add(nums1[i][0]);
            pair.add(nums1[i][1]);
            result.add(pair);
            i++;
        }

        // Handle remaining elements in nums2
        while (j < nums2.length) {
            List<Integer> pair = new ArrayList<>();
            pair.add(nums2[j][0]);
            pair.add(nums2[j][1]);
            result.add(pair);
            j++;
        }

        // Convert result List<List<Integer>> to int[][]
        int[][] ans = new int[result.size()][2];
        for (int k = 0; k < result.size(); k++) {
            ans[k][0] = result.get(k).get(0);
            ans[k][1] = result.get(k).get(1);
        }

        return ans;
    }
}
