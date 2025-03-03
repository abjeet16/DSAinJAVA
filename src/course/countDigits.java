package course;

public class countDigits {
    public static void main(String[] args) {
        int num = 1234599999;
        System.out.println(countDigits(num));
    }
    static int countDigits(int num) {
        int count = 0;
        while(num != 0) {
            num /=10;
            count++;
        }
        return count;
    }
}
