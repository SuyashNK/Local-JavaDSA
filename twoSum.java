//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

public class twoSum {

    public static int[] twoSum(int[] nums, int target){
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {}; //for no solution
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    
}