package dsa.leetcode;

import java.util.*;

public class FindMedianSortedArrays {

    public static void main(String[] args) {
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();
        double result = findMedianSortedArrays.solution(new int[]{1, 2},new int[]{3, 4});
        System.out.println(result);
    }


    public double solution(int[] nums1, int[] nums2) {

        List<Integer> numsList = new ArrayList<>();

        addArraytoList(nums1, numsList);
        addArraytoList(nums2, numsList);

        Collections.sort(numsList);

        int center = numsList.size() / 2;
        if (numsList.size() % 2 == 0) {
            return (double) ((numsList.get(center)) + (numsList.get((center) - 1))) / 2;
        } else {
            return numsList.get(center);
        }
    }

    private void addArraytoList(int[] nums, List<Integer> numsList) {
        for(int n: nums){
            numsList.add(n);
        }
    }


}
