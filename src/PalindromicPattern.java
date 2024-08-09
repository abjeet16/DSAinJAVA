public class PalindromicPattern {
    public static void main(String[] args) {
        int size = 5;
        palindromicPattern(size);
    }

    private static void palindromicPattern(int size) {
        int count = 0;
        for (int i = 0; i<size ; i++){
            count++;
            for (int j = 0 ; j<size-i;j++){
                System.out.print("  ");
            }
            for (int j = 0 ; j < i+count  ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
