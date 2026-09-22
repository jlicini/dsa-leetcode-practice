package dsa.leetcode;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int x = bs.search(new int[] {-1,0,4,5,9,12}, 9);
        System.out.println(x);
    }

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length -1;


        while (left <= right) {
            int middle = (left + right) / 2;

            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }



        return -1;
    }
}
