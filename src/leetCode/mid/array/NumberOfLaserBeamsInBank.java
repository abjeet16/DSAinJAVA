package leetCode.mid.array;

public class NumberOfLaserBeamsInBank {
    public static int numberOfBeams(String[] bank) {
        int len = bank.length;
        int res = 0 ;
        int r1Count = 0;
        int r2Index = 0;
        while (r2Index<len){
            int r2Count = securityDevicesInRow(bank[r2Index]);
            if (r2Count!=0) {
                res += r1Count * r2Count;
                r1Count = r2Count;
            }
            r2Index++;
        }
        return res;
    }

    private static int securityDevicesInRow(String s) {
        int res = 0;
        for (char curr : s.toCharArray()){
            if (curr=='1')
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
}
