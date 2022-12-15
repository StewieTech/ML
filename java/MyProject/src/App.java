

public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//         int studentAge = 15;
//         double studentGPA = 3.5;
//         char studentLastInitial = 'h';
        
//         String studentName = "Errol1";
//         char studentFirstInitial = studentName.charAt(0);

//         System.out.println(studentAge);
//         System.out.println(studentName);
//         System.out.println(studentFirstInitial + " " + studentLastInitial+ " has a GPA of" + " " );
//     }
// }

// System.out.println

// public static int length(String str) {
//     int count = 0 ;
//     for (int i = 0; i < str.length; i++ ) {
//         count ++ ;
//         return count ;
//     }
// }

public class Challenge {
    public static int search(int arr[], int item) {
   for(int i = 0; i < arr.length; i++)
          {
              if(arr[i]==item)
                  return i;
          }
          return -1;
      }
  }
}