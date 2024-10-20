// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    public static List<List<Integer>> combinationSum(int[] nums, int target){
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        backtrack(nums, target, 0, currentCombination, answer);
        return answer;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));  // Store a copy of the current combination
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;  // Skip if the candidate exceeds the remaining target
            }

            currentCombination.add(candidates[i]);  // Choose the candidate
            backtrack(candidates, target - candidates[i], i, currentCombination, result);  // Continue to explore with reduced target
            currentCombination.remove(currentCombination.size() - 1);  // Undo the choice (backtrack)
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(nums, target));
    }
}
