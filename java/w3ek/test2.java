

import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays ;
import java.util.ArrayList;



public class test2 {
    public static <T> void mergeSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!

 if (arr.length > 1) {
            // Split the array into two halves
            int mid = arr.length / 2;
            T[] leftArr = (T[]) new Object[mid];
            T[] rightArr = (T[]) new Object[arr.length - mid];
            for (int i = 0; i < mid; i++) {
                leftArr[i] = arr[i];
            }
            for (int i = mid; i < arr.length; i++) {
                rightArr[i - mid] = arr[i];
            }

            // Recursively sort the two halves
            mergeSort(leftArr, comparator);
            mergeSort(rightArr, comparator);

            // Merge the two sorted halves back into the original array
            int i = 0, j = 0, k = 0;
            while (i < leftArr.length && j < rightArr.length) {
                if (comparator.compare(leftArr[i], rightArr[j]) <= 0) {
                    arr[k++] = leftArr[i++];
                } else {
                    arr[k++] = rightArr[j++];
                }
            }
            while (i < leftArr.length) {
                arr[k++] = leftArr[i++];
            }
            while (j < rightArr.length) {
                arr[k++] = rightArr[j++];
            }
        }
    }

    
    public static void lsdRadixSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
    
        // Find the maximum value in the array
        int max = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, Math.abs(arr[i]));
        }
    
        // Count the number of digits in the maximum value
        int numDigits = 0;
        while (max > 0) {
            numDigits++;
            max /= 10;
        }
    
        // Create buckets for each digit (positive and negative)
        List<List<Integer>> posBuckets = new ArrayList<>(10);
        List<List<Integer>> negBuckets = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            posBuckets.add(new LinkedList<>());
            negBuckets.add(new LinkedList<>());
        }
    
        // Sort each digit from least significant to most significant
        for (int d = 1; d <= numDigits; d++) {
            // Place each value in the appropriate bucket
            for (int i = 0; i < arr.length; i++) {
                int digit = getDigit(arr[i], d);
                if (arr[i] >= 0) {
                    posBuckets.get(digit).add(arr[i]);
                } else {
                    negBuckets.get(digit).add(arr[i]);
                }
            }
    
            // Copy the values back into the original array
            int arrIndex = 0;
    
            // Copy negative values in reverse order (for stability)
            for (int i = negBuckets.size() - 1; i >= 0; i--) {
                for (int j = negBuckets.get(i).size() - 1; j >= 0; j--) {
                    arr[arrIndex++] = negBuckets.get(i).get(j);
                }
                negBuckets.get(i).clear();
            }
    
            // Copy positive values
            for (int i = 0; i < posBuckets.size(); i++) {
                for (int j = 0; j < posBuckets.get(i).size(); j++) {
                    arr[arrIndex++] = posBuckets.get(i).get(j);
                }
                posBuckets.get(i).clear();
            }
        }
    }
    
    /**
     * Returns the d-th digit of the given value, counting from the least
     * significant digit (d = 1). If the value has fewer than d digits, returns 0.
     */
    private static int getDigit(int value, int d) {
        int divisor = (int) Math.pow(10, d - 1);
        return (Math.abs(value) / divisor) % 10;
    }
    
    
        

    public static void main(String[] args) {
        Integer[] arr1 = {10, 4, 3, -5, 2, 606, -8983};
        mergeSort(arr1, Comparator.naturalOrder());
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {10, 4, 3, -5, 2, 606, -8983};
        lsdRadixSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
