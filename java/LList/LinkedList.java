package LList;
// import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T> {
    
    private Node<T> head;
    private Node<T> tail;
    private int size;



    public LinkedList() {
        head = null ;
        tail = null ;
        size = 0; // may remove at some point
    }



    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void addAtIndex(T data, int index) {
        if (data == null) {
            throw new IllegalArgumentException("You cannot add null data to the list");
        }

        if ( index < 0 || index > size) {
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }


        Node<T> newNode = new Node<T>(data);
        // T currentIndex = getAtIndex(index - 1);

        // addToFront
        if (index == 0) {
            newNode.setNext(head);
            head = newNode ;

            if (tail == null) {
                tail = head;
            }

            size ++ ;

            // addToBack
        } else if (index == size ) {
            if (tail == null) {
                head = newNode ;
                tail = newNode ;
            } else {
                tail.setNext(newNode) ;
                tail = newNode ;
            }

            // tail.next = newNode.next ;
            size ++ ;
        } else {

            // newNode.next = currentIndex.next ;
            // currentIndex.next = newNode ;
            Node<T> currentNode = head ;
            for (int i = 0 ; i < index - 1; i++) {
                currentNode = currentNode.getNext() ;
            }
            newNode.setNext(currentNode.getNext()) ;
            currentNode.setNext(newNode) ; 
            size ++;

        }
    }

    public T getAtIndex(int index) {
        
        if ( index < 0 || index > size) {
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }

        Node<T> current = head ; 
        for (int i = 0; i < index; i++) {
            current = current.getNext() ; 
        }

        return current.getData() ;
        
    }
        // while (size > 0)
        // if (index == pos) {
        //     return index ; 
        //     size -- ;
            
        // }
        
    public T removeAtIndex(int index) {
        if ( index < 0 || index >= size) {
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }

        
        // removeFromFront
        T removedData;
        if (index == 0) {
        if (head == null) {
            throw new NoSuchElementException("The list is empty") ;
        }
        removedData = head.getData();
        head = head.getNext() ; 

        if (head == null ) {
            tail = null ; 
        }

        size -- ;
        return removedData ;

        
        //removeFromBack
        } else if (index == size -1) {
            if (tail == null) {
                throw new IllegalArgumentException("The list is empty");
            }

            removedData = tail.getData() ; 
            if (head == tail) {
                head = null ;
                tail = null ;
            } else {
                Node<T> current = head ;
                while (current.getNext() != tail ) {
                    current = current.getNext() ; 
                }

                current.setNext(null) ;
                tail = current; // ccheck
            }
            size -- ;
            return removedData ;

        }

        Node<T> currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }
    
        removedData = currentNode.getNext().getData();
        currentNode.setNext(currentNode.getNext().getNext()) ;
        size--;
    
        return removedData;
    



    }

    public T remove(T data) {
        if (data == null) {
            throw new IllegalArgumentException("You cannon remove null data from the list");
        }
        if (isEmpty()) {
            throw new NoSuchElementException("The list is empty");
        }

        if (data.equals(head.getData())) {
                
    
                if (head == null) {
                    throw new NoSuchElementException("The list is empty") ;
                }
                T removedDataFront = head.getData();
                head = head.getNext() ; 
        
                if (head == null ) {
                    tail = null ; 
                }
        
                size -- ;
                return removedDataFront ;
        

                
        }

        Node<T> current = head;
        while (current.getNext() != null) {
            if (data.equals(current.getNext().getData())) {
                T removedData = current.getNext().getData();
                current.setNext(current.getNext().getNext()) ;
                size --;
                return removedData ;
            }
            current = current.getNext() ;
        }

        throw new NoSuchElementException("The data is not present in the list.");
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
