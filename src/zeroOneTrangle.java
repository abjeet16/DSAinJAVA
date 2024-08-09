public class zeroOneTrangle {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0;i<size;i++){
            for (int j = 0 ; j<i;j++){
                int bool = i +j ;
                if (bool%2==0){
                    System.out.print("0 ");
                }else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
