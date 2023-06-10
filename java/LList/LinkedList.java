package LList;
import java.util.ArrayList;

public class LinkedList<T> implements List<T> {
    
    Node<T> head;
    Node<T> tail;
    private int size;
    private ArrayList<T> list; // placeholder



    public LinkedList() {
        head = null ;
        tail = null ;
    }


    if (list == null) {
        head = null;
        tail = null;
        size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }


}
