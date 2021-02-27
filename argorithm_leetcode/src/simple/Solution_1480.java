package simple;

import org.junit.Test;

public class Solution_1480 {
    /**
     *  1480.一维数组的动态和
     * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i])
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1]+nums[i];
        }
        return result;
    }

    /**
     *  这种方式,覆盖了原数组内容, 执行效率和上一种方式一样, 但是更节省了内存
     * @param nums
     * @return
     */
    public int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }

    @Test
    public void testMethod(){
        Solution_1480 solution = new Solution_1480();
        int[] sum = solution.runningSum(new int[]{1, 2, 3, 4});
        for (int inti : sum) {
            System.out.println(inti);
        }
    }
}
