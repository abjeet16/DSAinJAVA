package recurtion;

public class SiftAllXtoEnd {
    public static void main(String[] args) {
        char[] arr ={'x','a','y','x','i','j','x'};
        moveALlX(arr,0,0,"");
    }

    private static void moveALlX(char[] arr, int index, int count,String newArr) {
        if (index == arr.length){
            for (int i = 0; i < count ; i++ ){
                newArr += 'x';
            }
            System.out.println(newArr);
            return;
        }
        char currentValue = arr[index];
        if (currentValue == 'x'){
            count ++ ;
        }else {
            newArr += currentValue;
        }
        moveALlX(arr,index+1,count,newArr);
    }
}
