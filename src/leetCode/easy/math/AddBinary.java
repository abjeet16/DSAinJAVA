package leetCode.easy.math;

public class AddBinary {
    /*
    0 + 0 = 0
    0 + 1 = 1
    1 + 0 = 1
    1 + 1 =10
    * */
    public static String addBinary(String a, String b) {
        boolean isCarry = false;
        int i = a.length()-1 , j = b.length()-1;
        StringBuilder stringBuilder = new StringBuilder();
        while (i>=0&&j>=0){
            char currA = a.charAt(i);
            char currB = b.charAt(j);
            if (isCarry){
                if (currA=='1'&&currB=='1'){
                    stringBuilder.append('1');
                } else if (currA=='1'||currB=='1') {
                    stringBuilder.append('0');
                    isCarry = true;
                }else {
                    stringBuilder.append('1');
                    isCarry = false;
                }
            }else {
                if (currA=='1'&&currB=='1'){
                    stringBuilder.append('0');
                    isCarry = true;
                } else if (currA=='1'||currB=='1') {
                    stringBuilder.append('1');
                }else {
                    stringBuilder.append('0');
                }
            }
            i--;j--;
        }
        if (i>=0){
            isCarry = addRemaning(i,a,stringBuilder,isCarry);
        }
        if (j>=0){
            isCarry = addRemaning(j,b,stringBuilder,isCarry);
        }
        if (isCarry){
            stringBuilder.append('1');
        }
        return stringBuilder.reverse().toString();
    }

    private static boolean addRemaning(int i, String a, StringBuilder stringBuilder, boolean isCarry) {
        for (int k = i;k>=0;k--){
            char curr = a.charAt(k);
            if (isCarry){
                if (curr=='1'){
                    stringBuilder.append('0');
                }else {
                    stringBuilder.append('1');
                    isCarry = false;
                }
            }else {
                if (curr=='1'){
                    stringBuilder.append('1');
                }else {
                    stringBuilder.append('0');
                }
            }
        }
        return isCarry;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("101111","10"));
    }
    /**
     * 101111
     *     10
     * 110001
     * 1110001
     */
}
