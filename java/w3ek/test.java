package w3ek;
// package w3ek;
import java.util.Comparator;

public class test {

    // public static <T> void insertionSort(T[] arr, Comparator<T> comparator) {
    //     // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
    //     for (int i = 1; i < arr.length; i++) {
    //         int j = i - 1;
    //         while (j >= 0 && comparator.compare(arr[j],arr[i] ) > 0) {
    //             arr[j+1] = arr[j];
    //             j--;
    //         }
    //         arr[j + 1] = arr[i];
    //     }
    // }

    public static <T> void insertionSort(T[] arr, Comparator<T> comparator) {
        for (int i = 1; i < arr.length; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && comparator.compare(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    

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



    public static void main(String[] args) {
        Comparator<Integer> intComparator = Comparator.comparingInt(i -> i);
        Integer[] arr = new Integer[]{5, 0, 3, 8, 9, 2, 7, 3, 1};
        insertionSort(arr, intComparator);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
