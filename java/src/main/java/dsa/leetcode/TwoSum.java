package dsa.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 For this solution, I need to iterate through every position in the array.
 Since I assume there is only one possible solution, for each number I check
 which number I need to reach the target.


 I calculate this number by subtracting the current number from the target.
 Then, I check if this number is already in the map.


 If it is not in the map, I save the current number and its position and
 continue iterating.


 Since there is only one valid solution, at some point I will find the
 number I need in the map.
 */
class TwoSum {

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();

        int[] nums = {2, -15, 11, 5};
        int target = -10;

        int[] result = twoSum.solution(nums, target);

        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] nums, int target) {

        int[] index = new int[2];

        Map<Integer, Integer> numberIndexMap = new HashMap<>();

        for(int i = 0; i<=nums.length; i++){

            int complement = target - nums[i];

            if(numberIndexMap.containsKey(complement)){
                return new int[]{i, numberIndexMap.get(complement)};
            }

            numberIndexMap.put(nums[i], i);
        }

        return index;
    }

}
