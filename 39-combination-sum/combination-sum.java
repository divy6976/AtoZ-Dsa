public class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Optional: helps with pruning
        backtrack(0, target, candidates, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int index, int target, int[] candidates,
                                  List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); // Found a valid combination
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) break; // Prune the branch early

            current.add(candidates[i]);
            backtrack(i, target - candidates[i], candidates, current, result); // Use same index (reuse allowed)
            current.remove(current.size() - 1); // Backtrack
        }
    }
}