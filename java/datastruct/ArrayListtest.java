

// public class ArrayListtest {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         list.addToBack(1);
//         list.addToBack(3);

//         System.out.println(list);
//         System.out.println(55);

//     }
// }


import java.util.NoSuchElementException;

public class ArrayListtest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add some elements to the list
        list.addToBack(1);
        list.addToBack(2);
        list.addToBack(3);
        list.addToBack(4);
        list.addToBack(5);

        // Print the current state of the list
        System.out.println(list);  // Output: [1, 2, 3, 4, 5]

        // Add an element to the front of the list
        list.addToFront(0);

        // Print the current state of the list
        System.out.println(list);  // Output: [0, 1, 2, 3, 4, 5]

        // Remove an element from the front of the list
        int removedElement = list.removeFromFront();
        System.out.println(removedElement);  // Output: 0

        // Print the current state of the list
        System.out.println(list);  // Output: [1, 2, 3, 4, 5]

        // Remove an element from the back of the list
        removedElement = list.removeFromBack();
        System.out.println(removedElement);  // Output: 5

        // Print the current state of the list
        System.out.println(list);  // Output: [1, 2, 3, 4]
    }
}
