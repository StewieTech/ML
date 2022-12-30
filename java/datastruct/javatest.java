class javatest {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
      
        list.addToFront(1);
        System.out.print(list.removeFromFront());
        list.addToFront(2);
        list.addToFront(5);
        list.addToFront(9);
        list.removeFromBack();
        list.addToBack(3);
        System.out.print(list.removeFromBack());
        System.out.print(list.removeFromFront());

//         
      

//   // 2
//            // 3
//         System.out.print(list.removeFromFront());  // 1
      
//         list.addToBack(4);
//         list.addToBack(5);
//         list.addToBack(6);
      
//         System.out.print(list.removeFromBack());   // 6
//         System.out.print(list.removeFromBack());   // 5
//         System.out.print(list.removeFromBack());   // 4
    }
}

  