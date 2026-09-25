package dsa.leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[]{-1,0,0,3,3,3,0,0,0}, 6, new int[]{1,2,2}, 3 );

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int count = 0;
        for(int i=0; i < nums1.length; i++) {

            if(nums1[i] != 0) continue;

            if (count<n) {
                nums1[i]=nums2[count];
                count++;
            }
        }

        Arrays.sort(nums1);

    }
}
