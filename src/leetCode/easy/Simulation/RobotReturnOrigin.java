package leetCode.easy.Simulation;

//657. Robot Return to Origin
public class RobotReturnOrigin {
    public boolean judgeCircle(String moves) {
        //left[0] right[1] up[2] down[3]
        int[] moveCount = new int[4];
        for (char curr : moves.toCharArray()){
            if (curr=='L')
                moveCount[0]++;
            else if (curr=='R')
                moveCount[1]++;
            else if (curr=='U') {
                moveCount[2]++;
            } else {
               moveCount[3]++;
            }
        }
        return moveCount[0]==moveCount[1]&&moveCount[2]==moveCount[3];
    }
    public boolean judgeCircleBetter(String moves) {
        int horizonal = 0,vertical = 0;
        for (char curr : moves.toCharArray()){
            if (curr=='L')
                horizonal--;
            else if (curr=='R')
                horizonal++;
            else if (curr=='U') {
                vertical++;
            } else {
                vertical--;
            }
        }
        return horizonal==0&&vertical==0;
    }
}
