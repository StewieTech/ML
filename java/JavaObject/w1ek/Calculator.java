import java.util.Scanner ;

public class Calculator {
    public static void main(String[] args) {
        // int x = 10, y = 3 ;
        // String a = "After", b = "Before";
        Scanner input = new Scanner(System.in) ;
        System.out.println("List of operations: add subtract multipy divide alphabetize") ;
        System.out.println("Select an operation") ;
        String operation = input.nextLine().toLowerCase() ;

        switch (operation) {
            case "add":
            System.out.print("Enter two integers.") ;
            int add1 = input.nextInt() ;
            int add2 = input.nextInt() ;
            if (add1 != input.nextInt() || add2 != input.nextInt() ) {
                System.out.println("Invalid input entered. Terminating...") ;
            }
            System.out.println("Answer: " +  (add1 + add2));
            break;

            case "subtract":
            System.out.print("Enter two integers.") ;
            int subtract1 = input.nextInt() ; 
            int subtract2 = input.nextInt() ;
            // if (!subtract1 || !subtract2 ) {
            //     System.out.println("Invalid input entered. Terminating...") ;
            // }
            System.out.println("Answer: " + (subtract1 - subtract2) ) ;
            break ; 

            case "multiply":
            System.out.print("Enter two doubles.");
            double multiply1 = input.nextDouble() ;
            double multiply2 = input.nextDouble() ;
            // if (!multiply1 || !multiply2) {
            //     System.out.println("Invalid input entered. Terminating...") ;
            // }
            System.out.printf("Answer %.2f%n", (multiply1 * multiply2) ) ;
            break ; 

            case "divide":
            System.out.print("Enter two doubles.");
            double divide1 = input.nextDouble() ;
            double divide2 = input.nextDouble() ;
            if (divide2 == 0) {
                System.out.println("Error: the denominator cannot be zero!") ;
                break ;
            } else if (divide1 != input.nextDouble() || divide2 != input.nextDouble() ) {
                System.out.println("Invalid input entered. Terminating...") ;
            } 
            System.out.printf("Answer %.2f%n", (divide1 / divide2)) ;
            break ;
            
            case "alphabetize" :
            System.out.print("enter two words" ) ;
            String a = input.next();
            String b = input.next();
            int winner = a.compareTo(b) ;
            if (winner == 0) {
                System.out.println("Both strings are lexicographically equal.");
            } else if (winner < 0) {
                
        
                    System.out.println("The String that comes first is: " + a);
            } else {
                
                System.out.println("The String that comes first is: " + b);
            }
            break;

            default:
            System.out.println("Invalid input entered. Terminating...") ;
            break ;
            
        }
        input.close() ;
            

        
        }
        
        // public static int add(int x, int y) {
        //     System.out.println("x: " + x + " y: " + y);
        //     return x + y;
        
    }
    
    // public static int subtract(int x, int y) {
    //     // System.out.println("x: " + x + " y: " + y);
    //     return x - y;
    // }
    // public static double multiply(double x, double y) {
    //     return x * y;
    // }
    // public static double divide(double x, double y) {
    //     return x / y;
    // }
    // public static String alphabetize(String a, String b) {


    //     System.out.println("Subtract solution: " +subtract(x,y));
    //     System.out.println("Multiply solution: " +multiply(x,y));
    //     System.out.printf("Divide solution: %.2f%n", divide(x,y));



