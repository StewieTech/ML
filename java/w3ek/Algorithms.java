package w3ek;

import java.util.Comparator;

/**
 * Your implementation of various iterative sorting algorithms.
 */
public class Algorithms {



    /**
     * Implement bubble sort.
     *
     * It should be:
     * in-place
     * stable
     * adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n)
     *
     * NOTE: You should implement bubble sort with the last swap optimization.
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
    //     boolean swapped;
    //     int n = arr.length;
    //     do {
    //         swapped = false;
    //     for (int i = 0; i < n ; i ++) {
    //         if (comparator.compare(arr[i], arr[i +1]) > 0) {
    //             T temp = arr[i];
    //             arr[i] = arr[i + 1];
    //             arr[i + 1] = temp ; 
    //             swapped = true ; 

    //         }
    //     }
    //     n -- ;
    // } while (swapped);
    boolean isSwapped = true;
    int lastUnsorted = arr.length - 1;
    while(isSwapped) {
        isSwapped = false;
        for (int i = 0; i < lastUnsorted; i++) {
            if (comparator.compare(arr[i],arr[i+1]) >0)  {
                swap(arr, i, i + 1);
                isSwapped = true;
            }
        }
        lastUnsorted--;
    }

    }
    
        private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
}


    /**
     * Implement selection sort.
     *
     * It should be:
     * in-place
     * unstable
     * not adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n^2)
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void selectionSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        for (int i = 0; i < arr.length -1 ; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j ++) {
                if (comparator.compare(arr[j], arr[minIndex]) <0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }
    


    /**
     * Implement insertion sort.
     *
     * It should be:
     * in-place
     * stable
     * adaptive
     *
     * Have a worst case running time of: O(n^2)
     * And a best case running time of: O(n)
     *
     * You may assume that the passed in array and comparator
     * are both valid and will never be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array that must be sorted after the method runs.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void insertionSort(T[] arr, Comparator<T> comparator) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while (j >= 0 && comparator.compare(arr[j],arr[i] ) > 0) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = arr[i];
        }
    }
}

