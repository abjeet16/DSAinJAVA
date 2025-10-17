package leetCode.easy.string;

//520. Detect Capital
public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        boolean isAllSmall = word.charAt(0)>=97;
        boolean allCaps = false;
        if (word.length()>1){
            allCaps = word.charAt(1)<97;
        }
        for (int i = 1 ; i < word.length() ; i++){
            boolean isCap = word.charAt(i)<97;
            if (isAllSmall){
                if (isCap)
                    return false;
            }else{
                if (allCaps) {
                    if (!isCap)
                        return false;
                }else {
                    if (isCap)
                        return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println((int)'A');
        System.out.println((int)'a');
        System.out.println(detectCapitalUse("ggg"));
    }
}
