package leetCode.easy.string;

//434. Number of Segments in a String
public class NumberSegmentsInAString {
    public int countSegments(String s) {
        if (s.isEmpty())
            return 0;
        int res = s.charAt(0)!=' '?1:0;
        for (int i = 1 ; i < s.length() ; i++){
            if (s.charAt(i-1)==' '&&s.charAt(i)!=' ')
                res++;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
