package course.array.sortedArray;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,4,4,4,5,5,5,5,5,5,5,5,5,5,7,8,40};
        int element = 5;
        //System.out.println(binarySearch(arr,element));
        //System.out.println(binarySearchRecursion(arr,element,0,arr.length));
        //System.out.println(binarySearchRecursionAccurance(arr,element,0,arr.length));
        //System.out.println(binarySearchFirstAccurance(arr,element));
        //System.out.println(binarySearchLastAccurance(arr,element));
        //System.out.println(binaryCountOfOccurance(arr,element));
        //System.out.println(sqaureRoot(25));

        int[] peekArr = {80,70,90,80,70,60,50,40,30,20,10,0};
        int peekIndex = peekElement(peekArr);
        System.out.println(peekArr[peekIndex]+"("+peekIndex+")");

        /*int[] arr1 = new int[2000];  // Simulating an infinite sorted array
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = i * 2;  // Fill with even numbers: 0, 2, 4, 6, 8, ...
        }
        int elementToSearch = 16;  // You can change this value
        System.out.println(searchInInfinityArray(arr1,elementToSearch));*/
    }

    static int peekElement(int[] arr){
        int start = 0;
        int end = arr.length;
        while (start<end) {
            int mid = (start+end)/ 2;
            if ((mid==0||arr[mid] >arr[mid-1])&&(mid==arr.length-1||arr[mid]>arr[mid+1]))
                return mid;
            else if (arr[mid] < arr[mid+1] ) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    private static int searchInInfinityArray(int[] arr, int element) {
        int i = 1;
        while (arr[i]<element){
            i*=2;
        }
        if (arr[i]==element)
            return i;
        else
            return binarySearchRecursion(arr,element,i/2,i);
    }
    private static int sqaureRoot(int num) {
        int start = 0;
        int end = num;
        int root = 0;
        while (start<=end) {
            int mid = (start+end)/ 2;
            if (mid*mid == num)
                return mid;
            else if (mid*mid > num)
                end = mid-1;
            else {
                start = mid + 1;
                root = mid;
            }
        }
        return root;
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
        if (start>end)
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
    static int binarySearchLastAccurance(int[] arr, int element){
        int start = 0;
        int end = arr.length;
        while (start<=end) {
            int mid = (start+end)/ 2;
            if (arr[mid] == element) {
                if (mid!= arr.length-1&&arr[mid+1]!=element)
                    return mid;
                else
                    start = mid+1;
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
    static int binaryCountOfOccurance(int[] arr, int element){
        int firstOccurance = binarySearchFirstAccurance(arr,element);
        if (firstOccurance==-1){
            System.out.println("the number is not present in the array");
        }
        return binarySearchLastAccurance(arr,element) -firstOccurance +1;
    }
}
