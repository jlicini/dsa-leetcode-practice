package dsa.leetcode;

import java.util.Arrays;

public class removeDuplicates {

    public static void main(String[] args) {
        removeDuplicates rm = new removeDuplicates();
        int sol = rm.solution(new int[]{1,2,2,3,4,4,5});
        System.out.println(sol);
    }

    public int solution(int [] nums){
        Arrays.sort(nums);

        int k = 1;
        for(int i =1; i <nums.length; i++){
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
