package LList;

public class Node<T> {

    // T data ;
    // private T next ;   
    private T data;
    private Node<T> next;

    // public Node( T data, T next) {

    // }

    public Node(T data) {
        this.data = data; //may need to remove
        next = null;
    }

    public T getData() { 
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;    }
}


