import java.util.Iterator;
import java.util.Iterator;

public class practice<T> implements Iterable<T> {
    public Iterator<T> iterator() {
        return new LLIterator<>();
    }
}

private class LLIterator implements Iterator<T> {
    private Node<T> curr;
    LLIterator () {curr = head;}
    public boolean hasNext() {return curr != null; }
    public T next() {
        if (hasNext()) {
            T temp = curr.next();
            curr = curr.next();
            return temp;
        }
        return null;
    }
}

Practice<String> courses = new Practice<>();

for (String course : courses) {

    }





Iterator<String> courseIt = courses.iterator();
while (courseIt.hasNext()) {
    String data = courseIt.next();
}