package leetCode.mid.array;

public class PrintArrayWIthIndex {
    public static void printArrayWithIndex(int[] freq) {
        for (int i = 0 ; i < freq.length ; i ++){
            System.out.print(freq[i]+"("+i+")"+",");
        }
        System.out.println();
    }
}
