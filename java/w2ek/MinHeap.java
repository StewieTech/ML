import java.util.NoSuchElementException;

/**
 * Your implementation of a MinHeap.
 */
public class MinHeap<T extends Comparable<? super T>> {

    /**
     * The initial capacity of the MinHeap.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 13;

     /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new MinHeap.
     *
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast a Comparable[] to a T[] to get the generic typing.
     */
    public MinHeap() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Comparable[INITIAL_CAPACITY];
    }

    /**
     * Adds an item to the heap. If the backing array is full (except for
     * index 0) and you're trying to add a new item, then double its capacity.
     *
     * Method should run in amortized O(log n) time.
     *
     * @param data The data to add.
     * @throws java.lang.IllegalArgumentException If the data is null.
     */
    public void add(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new IllegalArgumentException("The data is Null !!!") ;
        }

        if (size + 1 == backingArray.length) {
            T[] newArray = (T[]) new Object[backingArray.length * 2];
            // System.arraycopy(backingArray, 0, newArray, 0, backingArray.length);
            // backingArray = newArray ;
            for ( int i = 1 ; i < backingArray.length ; i ++ ) {
                newArray[i] = backingArray[i];
            }
        }

        size++ ; 
        int index = size ; 
        backingArray[index] = data ;

        while (index > 1 && backingArray[index].compareTo(backingArray[index / 2]) < 0) {
            T temp = backingArray[index];
            backingArray[index] = backingArray[index / 2];
            backingArray[index / 2] = temp;
            index = index / 2;
        }

    }
                                               
                                               

    /**
     * Removes and returns the min item of the heap. As usual for array-backed
     * structures, be sure to null out spots as you remove. Do not decrease the
     * capacity of the backing array.
     *
     * Method should run in O(log n) time.
     *
     * @return The data that was removed.
     * @throws java.util.NoSuchElementException If the heap is empty.
     */
    public T remove() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (size == 0) {
            throw new NoSuchElementException("Can't remove nothing baby!");
        }

        T min =  backingArray[1];
        backingArray[1] = backingArray[size];
        backingArray[size] = null ;
        size --;

        int index = 1;
        while (index * 2 <= size ) {
            int child = index * 2 ;
            if (child < size && backingArray[child].compareTo(backingArray[child + 1]) > 0 ) {
                child++ ;
            } 
            if (backingArray[index].compareTo(backingArray[child]) >0) {
                T temp = backingArray[index];
                backingArray[index] = backingArray[child];
                backingArray[child] = temp ;
                index = child ; 
            } else {
                break ;
            }
        }

        return min ; 




    }

    /**
     * Returns the backing array of the heap.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The backing array of the list
     */
    public T[] getBackingArray() {
        // DO NOT MODIFY THIS METHOD!
        return backingArray;
    }

    /**
     * Returns the size of the heap.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}