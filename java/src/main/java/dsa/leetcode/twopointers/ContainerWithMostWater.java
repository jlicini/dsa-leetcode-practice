package dsa.leetcode.twopointers;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int max_area = containerWithMostWater.max_area(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(max_area);
    }

    public Integer max_area(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while (left < right) {

            if (heights[left]>heights[right]) {
                max = Math.max(max, heights[right]*(right-left));
                right-=1;
            } else if (heights[left]<heights[right]) {
                max = Math.max(max, heights[left]*(right-left));
                left+=1;
            } else {
                max = Math.max(max, heights[right]*(right-left));
                right-=1;
                left+=1;
            }
        }

        return max;
    }
}
