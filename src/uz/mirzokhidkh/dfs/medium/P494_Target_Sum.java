package uz.mirzokhidkh.dfs.medium;

public class P494_Target_Sum {

    public int count;

    public int findTargetSumWays(int[] nums, int target) {

        findTargetSumWays(nums, target + nums[0], 1);
        findTargetSumWays(nums, target - nums[0], 1);

        return count;
    }

    public void findTargetSumWays(int[] nums, int target, int i) {

        if (i == nums.length) {
            if (target == 0) {
                count++;
            }
            return;
        }

        findTargetSumWays(nums, target + nums[i], i + 1);
        findTargetSumWays(nums, target - nums[i], i + 1);

    }

}


