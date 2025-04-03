package ArrayList.basics;

public class sort2DArray {
    public static void main(String[] args) {
        int[][] arr = {{9,8,7},{6,5,4},{3,2,1},{0,-1,-2}};
        sort(arr, arr.length,arr[0].length);
    }
    static void sort(int[][] arr,int row,int col){
        int [] single = new int[row*col];
        for (int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                single[i*col+j] = arr[i][j];
            }
        }
        for(int i = 0;i<single.length;i++){
            for (int j = i+1;j<single.length;j++){
                if(single[i]>single[j]){
                    int temp = single[i];
                    single[i] = single[j];
                    single[j] = temp;
                }
            }
        }
        for (int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                arr[i][j] = single[i*col+j];
            }
        }
        display(arr,row,col);
    }
    static void display(int[][] arr,int row,int col){
        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
