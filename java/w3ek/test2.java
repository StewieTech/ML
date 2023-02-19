

import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays ;



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
    
        final int BASE = 10;
        int maxNum = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > maxNum) {
                maxNum = Math.abs(arr[i]);
            }
        }
    
        int numDigits = 0;
        while (maxNum > 0) {
            numDigits++;
            maxNum /= BASE;
        }
    
        int[] counters = new int[BASE];
        int[] output = new int[arr.length];
    
        for (int digit = 0; digit < numDigits; digit++) {
            // Initialize counters
            for (int i = 0; i < BASE; i++) {
                counters[i] = 0;
            }
    
            // Count the occurrence of each digit
            for (int i = 0; i < arr.length; i++) {
                int digitValue = (int) (arr[i] / Math.pow(BASE, digit)) % BASE;
                counters[digitValue]++;
            }
    
            // Calculate the cumulative count for each digit
            for (int i = 1; i < BASE; i++) {
                counters[i] += counters[i - 1];
            }
    
            // Populate the output array
            for (int i = arr.length - 1; i >= 0; i--) {
                int digitValue = (int) (arr[i] / Math.pow(BASE, digit)) % BASE;
                output[--counters[digitValue]] = arr[i];
            }
    
            // Copy the output array back to the original array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = output[i];
            }
        }
    }
    
        

    public static void main(String[] args) {
        Integer[] arr1 = {10, 4, 3, 5, 2};
        mergeSort(arr1, Comparator.naturalOrder());
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {10, 4, 3, 5, 2};
        lsdRadixSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
