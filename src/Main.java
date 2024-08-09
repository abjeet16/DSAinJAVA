import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 3, 2}; // Example array
        int[] sortedArr = sortByFrequency(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sortByFrequency(int[] arr) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list from the array to use Collections.sort
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Step 3: Sort the list with a custom comparator
        list.sort((a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA != freqB) {
                return freqA - freqB; // Sort by frequency
            } else {
                return a - b; // Sort by natural order if frequencies are the same
            }
        });

        // Step 4: Convert the list back to an array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
