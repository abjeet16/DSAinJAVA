package leetCode.strivers.binarySearch.easy;
/// 1539. Kth Missing Positive Number
public class KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {

        // If the first number in array is already greater than k,
        // then none of the first k positive numbers are present in the array.
        // So the missing k-th number is just k itself.
        if (arr[0] > k) {
            return k;
        }

        // Binary search setup
        int left = 0, right = arr.length - 1, res = -1;

        // Goal: Find the index where missing numbers count becomes >= k
        while (left <= right) {
            int mid = (left + right) / 2;

            // diff = how many numbers are missing before arr[mid]
            // Example: arr[mid] = 6, mid = 3 → diff = 6 - 3 - 1 = 2 missing numbers
            int diff = arr[mid] - mid - 1;

            // If missing count before mid is less than k, we move right
            // because we haven't reached the k-th missing number yet
            if (diff < k) {
                res = mid;        // store this index as a possible answer
                left = mid + 1;   // search in right half
            } else {
                // missing count is high, search in left half
                right = mid - 1;
            }
        }

        // After binary search, arr[res] is the closest index where missing < k.
        // Now calculate the exact k-th missing number:
        // missing till res = arr[res] - (res + 1)
        // remaining missing needed = k - missing till res
        // So final answer = arr[res] + remaining
        res = arr[res] + (k - (arr[res] - (res + 1)));

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,3};//0,1,2,3,4
        int k = 1;
        System.out.println(findKthPositive(arr,k));
    }
}
