import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

/**
 * Your implementation of various divide & conquer sorting algorithms.
 */

public class Sorting {

    /**
     * Implement merge sort.
     *
     * It should be:
     * out-of-place
     * stable
     * not adaptive
     *
     * Have a worst case running time of: O(n log n)
     * And a best case running time of: O(n log n)
     *
     * You can create more arrays to run merge sort, but at the end, everything
     * should be merged back into the original T[] which was passed in.
     *
     * When splitting the array, if there is an odd number of elements, put the
     * extra data on the right side.
     *
     * Hint: You may need to create a helper method that merges two arrays
     * back into the original T[] array. If two data are equal when merging,
     * think about which subarray you should pull from first.
     *
     * You may assume that the passed in array and comparator are both valid
     * and will not be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array to be sorted.
     * @param comparator The Comparator used to compare the data in arr.
     */
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




    /**
     * Implement LSD (least significant digit) radix sort.
     *
     * It should be:
     * out-of-place
     * stable
     * not adaptive
     *
     * Have a worst case running time of: O(kn)
     * And a best case running time of: O(kn)
     *
     * Feel free to make an initial O(n) passthrough of the array to
     * determine k, the number of iterations you need.
     *
     * At no point should you find yourself needing a way to exponentiate a
     * number; any such method would be non-O(1). Think about how how you can
     * get each power of BASE naturally and efficiently as the algorithm
     * progresses through each digit.
     *
     * You may use an ArrayList or LinkedList if you wish, but it should only
     * be used inside radix sort and any radix sort helpers. Do NOT use these
     * classes with merge sort. However, be sure the List implementation you
     * choose allows for stability while being as efficient as possible.
     *
     * Do NOT use anything from the Math class except Math.abs().
     *
     * You may assume that the passed in array is valid and will not be null.
     *
     * @param arr The array to be sorted.
     */
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

    
    }
