class javatest {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
      
        list.addToFront(1);
        list.addToFront(2);
        list.addToBack(3);
      

        System.out.println(list.removeFromFront());  // 2
        System.out.println(list.removeFromBack());   // 3
        System.out.println(list.removeFromFront());  // 1
      
        list.addToBack(4);
        list.addToBack(5);
        list.addToBack(6);
      
        System.out.println(list.removeFromBack());   // 6
        System.out.println(list.removeFromBack());   // 5
        System.out.println(list.removeFromBack());   // 4
    }
}

  