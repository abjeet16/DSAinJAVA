package leetCode.easy.math;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int num1Index = num1.length(),num2Index = num2.length();
        if (num1Index>num2Index){
            num2 = addZerosInFront(num2,num1Index-num2Index);
        } else if (num1Index<num2Index) {
            num1 = addZerosInFront(num1,num2Index-num1Index);
        }
        int carry = 0;
        int currDigit = num1.length()-1;
        while (currDigit>=0){
            int curr1 = Integer.parseInt(String.valueOf(num1.charAt(currDigit)));
            int curr2 = Integer.parseInt(String.valueOf(num2.charAt(currDigit)));
            int sum = carry+curr2+curr1;
            if (sum>9){
                carry=(sum)/10;
            }
            res.append(sum%10);
            currDigit--;
        }
        return res.reverse().toString();
    }

    private static String addZerosInFront(String num, int zerosCount) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < zerosCount ; i++){
            stringBuilder.append("0");
        }
        return stringBuilder+num;
    }

    public static void main(String[] args) {
        String num1 = "1234";
        String num2 = "123";
        System.out.println(addStrings(num1,num2));
    }
}
