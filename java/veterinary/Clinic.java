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
        // Scanner in = new Scanner(System.in);
        String line = null;
        StringBuilder reportBuilder = new StringBuilder();

        while ((sc.hasNextLine())) {
            line = sc.nextLine() ;
            String[] info = line.split(","); ;
        // while(!(info == null)) 
        
            String petName = info[0] ;
            String petType = info[1] ;
            String appTime = info[3] ;
            // String timeOut = info[3] ;
            if (!(petType.equals("Dog") || petType.equals("Cat"))) {
                throw new InvalidPetException() ;
                // Do not catch the exception in your code! The caller of the method should handle the exception.
            }
            System.out.printf("Consultation for %s the %s at %s\n", petName, petType, appTime) ;
            // System.out.printf("Consultation for %s the %s at %s.\nWhat is the health of %s?\n",
            // petName, petType, appTime);
            
            // double health = takeDoubleInput();
            // double healthInput = sc.nextInt();
               double healthInput = takeDoubleInput("What is the health of " + petName) ;
               int painLevelInput = takeIntInput("On a scale of 1 to 10, how much pain is " + petName + " in right now?") ;
            
            // System.out.printf("On a scale of 1 to 10, how much pain is %s in right now?\n", petName) ;
            // int painLevel = sc.nextInt();
            // System.out.printf("What is the health of %s?\n", petName) ;
            // Call speak()
            
            Pet pet;
            if (petType.equals("Dog")) {
                double droolRate = takeDoubleInput("What is the drool rate of " + petName + "?");
                pet = new Dog(petName, healthInput, painLevelInput, droolRate) ;
            } else {
                int miceCaught = takeIntInput("How many mice has " + petName + " caught?") ;
                pet = new Cat(petName, healthInput, painLevelInput, miceCaught);
            }
            
            pet.speak() ;


            int treatmentTime = pet.treat();
            String timeOut = addTime(appTime, treatmentTime) ;

            String patientInfo = petName + "," + petType + "," + getInfo(pet) + "," + "Day " + day + ","
            + appTime + "," + timeOut + "," + pet.getHealth() + "," + pet.getPainLevel();

            reportBuilder.append(patientInfo).append("\n") ;
        }
        return reportBuilder.toString() ;


         
        
    }
    public String nextDay(String fileName) throws FileNotFoundException {
        return nextDay(new File(fileName));
    }

    public boolean addToFile(String patientInfo) {
        try {
            PrintWriter writer = new PrintWriter(patientFile);
            Scanner scanner = new Scanner(patientFile) ;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.println(line);
            }

            writer.println(patientInfo);
            writer.close();

            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }


    private double takeDoubleInput(String message) {
        Scanner input = new Scanner(System.in) ;
        double userValue;
        while (true) {
            System.out.println(message) ;
            if (input.hasNextDouble()) {
                userValue = input.nextDouble();
                break;
            } else {
                input.nextLine();
            }
        } 
        return userValue ;
    }

    private int takeIntInput(String message) {
        Scanner input = new Scanner(System.in) ;
        int userValue ;
        while (true) {
            System.out.println(message);
            if (input.hasNextInt()) {
                userValue = input.nextInt();
                break;
            } else {
                input.nextLine();
            }
        } 
        return userValue ;
    }

    private static String addTime(String timeIn, int treatmentTime) {
        int hoursIn = Integer.parseInt(timeIn.substring(0, 2)) ;
        int minutesIn = Integer.parseInt(timeIn.substring(3));
        // int totalMinutes = hoursIn * 60 + minutesIn + treatmentTime;
        int hoursOut = hoursIn + (int) ((minutesIn + treatmentTime) / 60);
        int minutesOut = (minutesIn + treatmentTime) % 60;  
    
        String timeOut = String.format("%02d:%02d", hoursOut, minutesOut);
        return timeOut;
    }

    private String getInfo(Pet pet) {
        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;
            return String.valueOf(dog.getDroolRate());
        } else if (pet instanceof Cat) {
            Cat cat = (Cat) pet;
            return String.valueOf(cat.getMiceCaught());
        }
        return "";
    }




}
