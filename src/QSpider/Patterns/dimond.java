package QSpider.Patterns;

public class dimond {
    public static void main(String[] args) {
        dimondStar(7);
        dimondAtoZRowAscTopDescBottom(7);
        dimondNumRowAscTopDescBottom(7);
        dimondAtoZRowDescTopAscBottom(7);
        dimondNumRowDescTopAscBottom(7);
        dimond1And0EvenOddStar(7);
        dimond1And0EvenOddRow(7);
    }

    /**
     * _ _ _ * _ _ _
     * _ _ * * * _ _
     * _ * * * * * _
     * * * * * * * *
     * _ * * * * * _
     * _ _ * * * _ _
     * _ _ _ * _ _ _
     * @param size
     */
    static void dimondStar(int size){
        System.out.println("---------------dimondStar---------------");
        if (size%2==0){
            System.out.print("Size can't be a even number");
            return;
        }
        int onSpace = size/2,noStar=1;
        for (int i = 0 ; i < size ; i ++){
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < noStar ; j++){
                System.out.print("* ");
            }
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            if (i < size/2){
                onSpace--;
                noStar+=2;
            }else {
                onSpace++;
                noStar-=2;
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ A _ _ _
     * _ _ B B B _ _
     * _ C C C C C _
     * D D D D D D D
     * _ C C C C C _
     * _ _ B B B _ _
     * _ _ _ A _ _ _
     * @param size
     */
    static void dimondAtoZRowAscTopDescBottom(int size){
        System.out.println("---------------dimondAtoZRowAscTopDescBottom---------------");
        if (size%2==0){
            System.out.print("Size can't be a even number");
            return;
        }
        int onSpace = size/2,noStar=1;
        for (int i = 0 ; i < size ; i ++){
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < noStar ; j++){
                if (i <= size/2){
                    System.out.print((char) ('A'+i)+" ");
                }else {
                    System.out.print((char) ('A'+size/2-(i-size/2))+" ");
                }
            }
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            if (i < size/2){
                onSpace--;
                noStar+=2;
            }else {
                onSpace++;
                noStar-=2;
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ 0 _ _ _
     * _ _ 1 1 1 _ _
     * _ 2 2 2 2 2 _
     * 3 3 3 3 3 3 3
     * _ 2 2 2 2 2 _
     * _ _ 1 1 1 _ _
     * _ _ _ 0 _ _ _
     * @param size
     */
    static void dimondNumRowAscTopDescBottom(int size){
        System.out.println("---------------dimondNumRowAscTopDescBottom---------------");
        if (size%2==0){
            System.out.print("Size can't be a even number");
            return;
        }
        int onSpace = size/2,noStar=1;
        for (int i = 0 ; i < size ; i ++){
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < noStar ; j++){
                if (i <= size/2){
                    System.out.print(i+" ");
                }else {
                    System.out.print(size/2-(i-size/2)+" ");
                }
            }
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            if (i < size/2){
                onSpace--;
                noStar+=2;
            }else {
                onSpace++;
                noStar-=2;
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ D _ _ _
     * _ _ C C C _ _
     * _ B B B B B _
     * A A A A A A A
     * _ B B B B B _
     * _ _ C C C _ _
     * _ _ _ D _ _ _
     * @param size
     */
    static void dimondAtoZRowDescTopAscBottom(int size){
        System.out.println("---------------dimondAtoZRowDescTopAscBottom---------------");
        if (size%2==0){
            System.out.print("Size can't be a even number");
            return;
        }
        int onSpace = size/2,noStar=1;
        for (int i = 0 ; i < size ; i ++){
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < noStar ; j++){
                if (i <= size/2){
                    System.out.print((char) ('A'+size/2-i)+" ");
                }else {
                    System.out.print((char) ('A'+(i-size/2))+" ");
                }
            }
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            if (i < size/2){
                onSpace--;
                noStar+=2;
            }else {
                onSpace++;
                noStar-=2;
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ 3 _ _ _
     * _ _ 2 2 2 _ _
     * _ 1 1 1 1 1 _
     * 0 0 0 0 0 0 0
     * _ 1 1 1 1 1 _
     * _ _ 2 2 2 _ _
     * _ _ _ 3 _ _ _
     * @param size
     */
    static void dimondNumRowDescTopAscBottom(int size){
        System.out.println("---------------dimondNumRowAscTopDescBottom---------------");
        if (size%2==0){
            System.out.print("Size can't be a even number");
            return;
        }
        int onSpace = size/2,noStar=1;
        for (int i = 0 ; i < size ; i ++){
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < noStar ; j++){
                if (i <= size/2){
                    System.out.print(size/2-i+" ");
                }else {
                    System.out.print((i-size/2)+" ");
                }
            }
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            if (i < size/2){
                onSpace--;
                noStar+=2;
            }else {
                onSpace++;
                noStar-=2;
            }
            System.out.println();
        }
    }

    //to do
    static void dimondAtoZColAscLeftDescRight(int size){
        System.out.println("---------------dimondAtoZRowAscTopDescBottom---------------");
        if (size%2==0){
            System.out.print("Size can't be a even number");
            return;
        }
        int onSpace = size/2,noStar=1;
        for (int i = 0 ; i < size ; i ++){
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < noStar ; j++){
                if (j <= noStar/2){
                    System.out.print((char) ('A'+j)+" ");
                }else {
                    System.out.print((char) ('A'+i-(j-noStar/2))+" ");
                }
            }
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            if (i < size/2){
                onSpace--;
                noStar+=2;
            }else {
                onSpace++;
                noStar-=2;
            }
            System.out.println();
        }
    }

    static void dimondAtoZColAscRightDescLeft(int size){
        System.out.println("---------------dimondAtoZRowAscTopDescBottom---------------");
        if (size%2==0){
            System.out.print("Size can't be a even number");
            return;
        }
        int onSpace = size/2,noStar=1;
        for (int i = 0 ; i < size ; i ++){
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < noStar ; j++){

            }
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            if (i < size/2){
                onSpace--;
                noStar+=2;
            }else {
                onSpace++;
                noStar-=2;
            }
            System.out.println();
        }
    }

    static void dimond1And0EvenOddStar(int size){
        System.out.println("---------------dimond1And0EvenOddStar---------------");
        if (size%2==0){
            System.out.print("Size can't be a even number");
            return;
        }
        int onSpace = size/2,noStar=1;
        for (int i = 0 ; i < size ; i ++){
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            for (int j = 1 ; j <= noStar ; j++){
                System.out.print(j%2+" ");
            }
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            if (i < size/2){
                onSpace--;
                noStar+=2;
            }else {
                onSpace++;
                noStar-=2;
            }
            System.out.println();
        }
    }

    static void dimond1And0EvenOddRow(int size){
        System.out.println("---------------dimond1And0EvenOddRow---------------");
        if (size%2==0){
            System.out.print("Size can't be a even number");
            return;
        }
        int onSpace = size/2,noStar=1;
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < noStar ; j++){
                System.out.print((i+1)%2+" ");
            }
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            if (i < size/2){
                onSpace--;
                noStar+=2;
            }else {
                onSpace++;
                noStar-=2;
            }
            System.out.println();
        }
    }

    static void dimond1And0(int size){
        System.out.println("---------------dimond1And0EvenOddRow---------------");
        if (size%2==0){
            System.out.print("Size can't be a even number");
            return;
        }
        int onSpace = size/2,noStar=1;
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < noStar ; j++){
                System.out.print((i+1)%2+" ");
            }
            for (int j = 0 ; j < onSpace;j++){
                System.out.print("_ ");
            }
            if (i < size/2){
                onSpace--;
                noStar+=2;
            }else {
                onSpace++;
                noStar-=2;
            }
            System.out.println();
        }
    }
}
