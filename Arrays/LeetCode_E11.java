package Arrays;

public class LeetCode_E11 {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1, area = Integer.MIN_VALUE;
        while(i < j) {
            if (height[j] >= height[i] ) {
                area = Math.max(area, height[i] * (j - i) );
                i++;
            } else  {
                area = Math.max(area, height[j] * (j - i) );
                j--;
            }
        }
        return area;
    }
}
