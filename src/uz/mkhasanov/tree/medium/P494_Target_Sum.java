package uz.mkhasanov.tree.medium;

public class P494_Target_Sum {

//    public static void main(String[] args) throws ParseException, IOException {
////        System.out.println(findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
//        System.out.println(findTargetSumWays(new int[]{1}, 1));
//
//    }


    int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        helper(nums, target - nums[0], 0);
        helper(nums, target + nums[0], 0);
        return count;
    }

    public void helper(int[] nums, int target, int pos) {
        if (pos == nums.length - 1) {
            if (target == 0) {
                count++;
            }
        } else {
            helper(nums, target - nums[pos + 1], pos + 1);
            helper(nums, target + nums[pos + 1], pos + 1);
        }
    }


}
