package recurtion.backTracking;

public class permutation {
    public static void main(String[] args) {
        String str = "ABC";
        printALlPermutation(str,"",0);
    }
    static void printALlPermutation(String str,String permutation,int index){
        if (str.isEmpty()){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length();i++){
            char currentChar = str.charAt(i);
            String newString = str.substring(0,i)+str.substring(i+1);
            printALlPermutation(newString,permutation+currentChar,index+1);
        }
    }
}
