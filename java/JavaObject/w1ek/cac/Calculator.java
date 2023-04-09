import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");

        String operation = sc.nextLine().toLowerCase();

        switch (operation) {
            case "add":
                System.out.println("Enter two integers:");
                if (sc.hasNextInt()) {
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    System.out.println("Answer: " + (num1 + num2));
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;
            case "subtract":
                System.out.println("Enter two integers:");
                if (sc.hasNextInt()) {
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    System.out.println("Answer: " + (num1 - num2));
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;
            case "multiply":
                System.out.println("Enter two doubles:");
                if (sc.hasNextDouble()) {
                    double num1 = sc.nextDouble();
                    double num2 = sc.nextDouble();
                    System.out.printf("Answer: %.2f%n", num1 * num2);
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;
            case "divide":
                System.out.println("Enter two doubles:");
                if (sc.hasNextDouble()) {
                    double num1 = sc.nextDouble();
                    double num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Invalid input entered. Terminating...");
                    } else {
                        System.out.printf("Answer: %.2f%n", num1 / num2);
                    }
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;
            case "alphabetize":
                System.out.println("Enter two words:");
                String word1 = sc.next();
                String word2 = sc.next();
                int result = word1.compareToIgnoreCase(word2);
                if (result == 0) {
                    System.out.println("Both words are lexicographically equal.");
                } else if (result < 0) {
                    System.out.println(word1 + " comes before " + word2 + " alphabetically.");
                } else {
                    System.out.println(word2 + " comes before " + word1 + " alphabetically.");
                }
                break;
            default:
                System.out.println("Invalid input entered. Terminating...");
        }
        sc.close();
    }
}
