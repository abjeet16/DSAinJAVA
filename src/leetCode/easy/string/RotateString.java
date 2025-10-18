package leetCode.easy.string;
//796. Rotate String
public class RotateString {
    public static boolean rotateString(String s, String goal) {
        int lenS = s.length();
        if (lenS!=goal.length())
            return false;
        String contactStr = goal+goal;
        int contLen = contactStr.length();
        for (int i = 0 ; i+lenS<contLen ; i++){
            if (contains(contactStr,i,i+lenS,s)){
                return true;
            }
        }
        return false;
    }

    private static boolean contains(String contactStr,int start, int end, String s) {
        int sIndex = 0;
        while (start<end){
            if (contactStr.charAt(start)!=s.charAt(sIndex)){
                return false;
            }
            start++;
            sIndex++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcde", goal = "abced";
        System.out.println(rotateString(s,goal));
    }
}
