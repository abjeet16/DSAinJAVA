package course.math;


public class maxAppearingElement {
    public static void main(String[] args) {
        int[] startArr = {1,2,4};
        int[] endArr = {4,5,7};
        int maxRange = 0;
        for (int i: endArr){
            if (maxRange<i){
                maxRange=i;
            }
        }
        maxAppear(startArr,endArr,maxRange+2);
    }
    static void maxAppear(int[] startArr,int[] endArr,int maxRange) {
        if (startArr.length != endArr.length){
            System.out.println("the size of start array doesnt match the size of end array");
            return;
        }
        int[] freq = new int[maxRange];
        fillArray(freq,0);
        for (int i = 0; i < startArr.length ; i++){
            freq[startArr[i]]+=1;
            freq[endArr[i]+1]-=1;
        }
        for (int i = 1;i<maxRange;i++){
            freq[i]+=freq[i-1];
        }
        int max = 0;
        for (int i = 0 ; i < freq.length ; i++){
            System.out.print(i+" : "+freq[i]+" | ");
            if (freq[max]<freq[i]){
                max = i;
            }
        }
        System.out.println();
        System.out.println("the most appearing number is "+max+" , which appears "+freq[max]+" times");
    }
    static void fillArray(int[] arr,int fill){
        for (int i : arr){
            i = fill;
        }
    }
}
