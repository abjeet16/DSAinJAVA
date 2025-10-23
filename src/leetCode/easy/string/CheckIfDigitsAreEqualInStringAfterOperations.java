package leetCode.easy.string;

///3461. Check If Digits Are Equal in String After Operations I
public class CheckIfDigitsAreEqualInStringAfterOperations {
    public boolean hasSameDigits(String s) {
        while (s.length()==2){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0 ; i < s.length()-1;i++){
                stringBuilder.append((s.charAt(i)+s.charAt(i+1))%10);
            }
            s = stringBuilder.toString();
            System.out.println(s);
        }
        return s.charAt(0)==s.charAt(1);
    }
}
