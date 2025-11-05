package leetCode.easy.Arrays;

import java.util.Arrays;

/// 661. Image Smoother
public class ImageSmoother {
    public static int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] res = new int[m][n];
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                res[i][j] = smoother(img,i,j,m,n);
            }
        }
        return res;
    }

    private static int smoother(int[][] img, int i, int j, int m, int n) {
        int count = 0;
        int sum = 0 ;
        for (int x = -1; x <= 1 ; x++){
            for (int y = -1 ; y <= 1 ; y++){
                int row = i+x;
                int col = j+y;
                if (row<0||col<0||row>=m||col>=n)
                    continue;
                sum += img[row][col];
                count++;
            }
        }
        return sum/count;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {100,200,100},
                {200,50,200},
                {100,200,100}};
        imageSmoother(arr);
    }
}
