
public class butterfly {
    public static void main(String[] args) {
        int size = 5;
        butterfly(size);
    }
    static void butterfly(int size){
        for (int i = 1 ; i <= size ; i++){
            for (int j = 1 ; j <= i; j ++){
                System.out.print("* ");
            }
            // getting the number of spaces to print
            int spaces = 2*size-2*i;

            for (int j = 0; j < spaces; j++){
                System.out.print("  ");
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = size ; i>0 ; i--){
            for (int j = 0;j<i ; j++){
                System.out.print("* ");
            }
            int spaces = 2*size - 2* i;
            for (int j = 0; j < spaces; j++){
                System.out.print("  ");
            }
            for (int j = 0;j<i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
