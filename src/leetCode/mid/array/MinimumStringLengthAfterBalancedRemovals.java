package leetCode.mid.array;

/// 3746. Minimum String Length After Balanced Removals
public class MinimumStringLengthAfterBalancedRemovals {
    public static int minLengthAfterRemovals(String s) {
        int aCount = 0;
        int bCount = 0;
        for (char ch :  s.toCharArray()){
            if (ch == 'a')
                aCount++;
            else
                bCount++;
        }
        int i = 0 ;
        int j = s.length();
        while (i<j){
            if (aCount==bCount){
                return s.length()-(aCount+bCount);
            }
            if (aCount>bCount){
                if (s.charAt(i)=='a'){
                    aCount--;
                    i++;
                }else {
                    aCount--;
                    j--;
                }
            }else {
                if (s.charAt(i)=='b'){
                    bCount--;
                    i++;
                }else {
                    bCount--;
                    j--;
                }
            }
        }
        return s.length();
    }

    public static void main(String[] args) {
        String s = "baa";
        System.out.println(minLengthAfterRemovals(s));
    }
}
