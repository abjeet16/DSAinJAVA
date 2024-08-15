package recurtion.Hard;

public class moveInMaze {
    public static void main(String[] args) {
        int n = 3 , m = 4;
        int totalPath = findNumberOfPath(0,0,n,m);
        System.out.println(totalPath);
    }

    private static int findNumberOfPath(int startN, int startM, int EndN, int EndM) {
        if (startM == EndM-1 && startN == EndN-1 ){
            return 1;
        }
        int DownStep=0,RightStep=0;
        if (startN+1 < EndN) {
            DownStep = findNumberOfPath(startN + 1, startM, EndN, EndM);
        }
        if (startM+1 <EndM) {
            RightStep = findNumberOfPath(startN, startM + 1, EndN, EndM);
        }
        return  DownStep+RightStep;
    }
}
