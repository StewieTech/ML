public class recursion {
    public void removeDuplicates() {
        head = rRemove(head);
    }
}

private Node<T> rRemove(Node<T> curr) {
    if (curr == null) {
        return null;
    }
}

curr.next = rRemove(curr.next);
if (curr.next != null && curr.data.equals(curr.next.data) {
    return curr.next;
}
return curr;
)