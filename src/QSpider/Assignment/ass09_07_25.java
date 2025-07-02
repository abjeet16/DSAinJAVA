package QSpider.Assignment;

public class ass09_07_25 {
    public static void main(String[] args) {
        leftInvertedStar(6);
    }
    static void leftInvertedStar(int size){
        for (int i = 0; i <size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
