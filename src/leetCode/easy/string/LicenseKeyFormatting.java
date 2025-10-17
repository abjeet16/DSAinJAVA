package leetCode.easy.string;

//482. License Key Formatting
public class LicenseKeyFormatting {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int i = s.length()-1 ; i >=0; i--){
            char curr = Character.toUpperCase(s.charAt(i));
            if (curr=='-')
                continue;
            if (count==k) {
                res.append('-');
                count = 0;
            }
            res.append(curr);
            count++;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "2-5g-3-J";
        int k = 2;
        System.out.println(licenseKeyFormatting(s,k));
    }
}
