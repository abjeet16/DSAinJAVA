package course.array.mid;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,4,4,4,5,5,5,5,5,5,5,5,5,5,7,8,40};
        int element = 3;
        //System.out.println(binarySearch(arr,element));
        //System.out.println(binarySearchRecursion(arr,element,0,arr.length));
        //System.out.println(binarySearchFirstAccurance(arr,element));
        System.out.println(binarySearchRecursionAccurance(arr,element,0,arr.length));
    }
    static int binarySearch(int[] arr, int element){
        int start = 0;
        int end = arr.length;
        while (start<end) {
            int mid = (start+end)/ 2;
            if (arr[mid] == element)
                return mid;
            else if (arr[mid] > element) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
    static int binarySearchRecursion(int[]arr, int element, int start, int end){
        if (start>=end)
            return -1;
        int mid = (start+end)/2;
        if (arr[mid] == element)
            return mid;
        else if (arr[mid] > element) {
            return binarySearchRecursion(arr,element,start,mid-1);//end = mid-1;
        }
        else {
            return binarySearchRecursion(arr,element,mid+1,end);//start = mid+1;
        }
    }
    static int binarySearchRecursionAccurance(int[]arr, int element, int start, int end){
        if (start>end)
            return -1;
        int mid = (start+end)/2;
        if (arr[mid] == element)
            if (mid!=0&&arr[mid-1]!=element)
                return mid;
            else
                return binarySearchRecursion(arr,element,start,mid-1);//end = mid-1;
        else if (arr[mid] > element) {
            return binarySearchRecursion(arr,element,start,mid-1);//end = mid-1;
        }
        else {
            return binarySearchRecursion(arr,element,mid+1,end);//start = mid+1;
        }
    }
    static int binarySearchFirstAccurance(int[] arr, int element){
        int start = 0;
        int end = arr.length;
        while (start<=end) {
            int mid = (start+end)/ 2;
            if (arr[mid] == element) {
                if (mid!=0&&arr[mid-1]!=element)
                    return mid;
                else
                    end = mid-1;
                    /*for (int i = mid-1 ; i >=0;i--)
                        if (i==0||arr[i-1]!=element)
                            return i;*/
            }
            else if (arr[mid] > element) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}
