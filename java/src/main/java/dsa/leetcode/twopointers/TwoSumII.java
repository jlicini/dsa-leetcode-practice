package dsa.leetcode.twopointers;

public class TwoSumII {
    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        boolean isTwoSum = twoSumII.twoSum(new int[] {1,3,4,6,8,10,13}, 12);
        System.out.println(isTwoSum);
    }

    public Boolean twoSum(int[] nums, Integer target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int sum = nums[left] + nums [right];

            if(sum == target) return true;
            else if (sum > target) right -=1;
            else left +=1;

        }
        return false;
    }
}
