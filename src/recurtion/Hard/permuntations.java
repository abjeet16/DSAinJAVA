package recurtion.Hard;

public class permuntations {
    public static void main(String[] args) {
        String str = "abc";
        findpermun(str,"");
    }

    private static void findpermun(String str, String permutation) {
        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0 ; i < str.length();i++){
            char current = str.charAt(i);
            String newStr =str.substring(0,i)+str.substring(i+1);

            findpermun(newStr,permutation+current);
        }
    }
}
