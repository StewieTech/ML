package veterinary;
import java.util.Scanner ;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;


public class Clinic {
    private File patientFile;
    private int day ;

    // File that contains patient info - assign to patientFile
    public Clinic(File file) {
        // super(name, type, info) ;
        patientFile = file ;
        // super(timeIn, getHealth(), getPainLevel(), TimeOut) ;
        // super(TimeOut);
        day = 1 ;
    }

    public Clinic(String fileName) {
        patientFile = new File(fileName) ; 
        day = 1;

    }
    
    public String nextDay(File f) throws FileNotFoundException { 
        day++ ;
        Scanner sc = new Scanner(f);
        Scanner in = new Scanner(System.in);
        String line = null;
        while ((sc.hasNextLine())) {
            line = sc.nextLine() ;
            String[] info = line.split(","); ;
        // while(!(info == null)) 
        
            String petName = info[0] ;
            String petType = info[1] ;
            String appTime = info[2] ;
            // String timeOut = info[3] ;
            if (!(petType == "Dog" || petType == "Cat")) {
                throw new InvalidPetException() ;
                // Do not catch the exception in your code! The caller of the method should handle the exception.
            }
            System.out.printf("Consultation for %s the %s at %s\n", petName, petType, appTime) ;
           
            // int healthInput = sc.nextInt();
           double healthInput = takeDoubleInput("What is the health of %s?\n" + petName) ;
           
            System.out.printf("On a scale of 1 to 10, how much pain is %s in right now?\n", petName) ;
            int painLevel = sc.nextInt();
            System.out.printf("What is the health of %s?\n", petName) ;
            // Call speak()
            Pet.speak() ;
            Pet.heal()
        }




         
        
    }
    public String nextDay(String fileName) throws FileNotFoundException {
    }

    private double takeDoubleInput(String message) {
        Scanner input = new Scanner(System.in) ;
        double value;
        while (true) {
            System.out.println(message) ;
            if (scanner.hasNextDouble()) {
                
            }
        }
    }
}
