import java.util.Iterator;

public class javatest {

List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
Iterator<String> iterator = names.iterator();
while (iterator.hasNext()) {
    String name = iterator.next();
    System.out.println(name);
}
}