package leetCode.easy.string;

public class ExcelSheetColumnTitle {
    /**
     * 1456 - 1 = 1455
     *
     * 1455 % 26 = 25 → Z (last letter = Z)
     *
     * 1455 / 26 = 55
     *
     * Take 55:
     *
     * 55 - 1 = 54
     *
     * 54 % 26 = 2 → C
     *
     * 54 / 26 = 2
     *
     * Take 2:
     *
     * 2 - 1 = 1
     *
     * 1 % 26 = 1 → B
     *
     * 1 / 26 = 0 (stop)
     *
     * ✅ Read backward: BCZ
     */
    public static String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber!=0){
           columnNumber--;
           res.append((char) ('A'+columnNumber%26));
           columnNumber/=26;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1456));
    }
}
