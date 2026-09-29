package dsa.leetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum tSum = new ThreeSum();
        //List<List<Integer>> sol = tSum.threeSum(new int[]{-1,0,1,2,-1,-1});
        //List<List<Integer>> sol = tSum.threeSum(new int[]{-5, -4, -3, -3, 0, 1, 2, 3, 4, 5});
        List<List<Integer>> sol = tSum.threeSum(new int[]{-1,0,1,2,-1,-4,-1,2,1}); //[ -4, -1, -1, -1, 0, 1, 1, 2, 2 ]
        System.out.println(sol);
    }

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        int pointer = 0;
        int left = pointer + 1;
        int right = nums.length - 1;
        boolean isEqual = true;
        List<List<Integer>> solution = new ArrayList<>();


        while (pointer < nums.length - 2) {


            while (left < right) {

                int result = nums[pointer]+nums[left]+nums[right];

               if ( result == 0) {
                   solution.add(List.of(nums[pointer], nums[left], nums[right]));
                   left += 1;
                   right -= 1;

                   left++;
                   right--;

                   // Saltar duplicados de left
                   while (left < right && nums[left] == nums[left - 1]) {
                       left++;
                   }

                   // Saltar duplicados de right
                   while (left < right && nums[right] == nums[right + 1]) {
                       right--;
                   }

               } else if (result < 0){
                    left += 1;
               } else {
                   right -= 1;
               }

            }

            pointer++;
            while (isEqual) {
                if (pointer!=0 && nums[pointer]==nums[pointer-1] && pointer < nums.length-1) {
                    pointer ++;
                } else {
                    isEqual = false;
                }
            }

            left = pointer + 1;
            right = nums.length - 1;
            isEqual = true;

        }

        return solution;
    }
}
