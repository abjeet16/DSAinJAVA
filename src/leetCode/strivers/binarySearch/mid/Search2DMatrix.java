package leetCode.strivers.binarySearch.mid;

/// 74. Search a 2D Matrix
public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length , rows = matrix.length;
        int left = 0  , right = rows*cols-1;
        while (left<=right){
            int mid = (left+right)/2;
            int i = mid/cols , j = mid%cols;
            if (target==matrix[i][j]){
                return true;
            } else if (target<matrix[i][j]) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] mat = {{1,3}};
        int target = 3;
        System.out.println(searchMatrix(mat,target));
    }
}
