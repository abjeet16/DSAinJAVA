package leetCode.mid.array;

public class ContainerWithMostWater {
    public static int maxAreaBrute(int[] height) {
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < height.length-1 ; i++){
            for (int j = i+1 ; j < height.length ; j++){
                if (Math.min(height[j],height[i])*(j-i)>max)
                    max = Math.min(height[j],height[i])*(j-i);
            }
        }
        return max;
    }

    public static int maxArea(int[] height) {
        int maxWeight = 0;
        int i = 0 , j = height.length-1;
        while (i<j){
            int distance = j-i;
            int minHeight = Math.min(height[j],height[i]);

            maxWeight = Math.max(maxWeight,distance*minHeight);
            if (height[i]>height[j])
                j--;
            else
                i++;
        }
        return maxWeight;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
