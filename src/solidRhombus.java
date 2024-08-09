public class solidRhombus {
    public static void main(String[] args) {
        int size = 6;
        solidRhombus(size);
    }
    static void solidRhombus(int size){
        for (int i = 0; i<size;i++){
            int space = size-i-1;
            for (int j = 0 ; j < space ; j++){
                System.out.print("  ");
            }
            for (int j = 0 ; j < size ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
