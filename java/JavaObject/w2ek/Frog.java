package w2ek;

// All variables must be not allowed to be directly modified outside the class in which they are declared, unless otherwise stated in the description of the variable
public class Frog {

    private final String name ;
    private int age ;
    private double tongueSpeed ;
    private boolean isFroglet;
    private static String species = "Rare Pepe";
    // double ageInYears;


    // A constructor that takes in name, age, and tongueSpeed and sets all variables appropriately.
    public Frog(String name, int age, double tongueSpeed) {
        this.name = name ;
        this.age = age ;
        this.tongueSpeed = tongueSpeed ;
        isFroglet() ;
        // this.species = species;
    }

    private void isFroglet(){
        if (this.age > 1 && this.age < 7) {
            this.isFroglet = true ;
        } else {

            this.isFroglet = false ; 
        }
    }

    public Frog(String name, double ageInYears, double tongueSpeed) {
        this.name = name;
        this.age = (int) Math.floor(ageInYears * 12);
        this.tongueSpeed = tongueSpeed ;
    }

    public Frog(String name) {
        this.name = name ;
        age = 5;
        tongueSpeed = 5;
        isFroglet() ;
    }

    // double months ;
    // public void grow(int months) {
    //     // this.months = months;
    //     this.age += months ;
    //     if (this.age <12) {
    //         this.tongueSpeed += months ; 
    //     } else if (this.age >= 30) {
    //         this.tongueSpeed -= (age - 30) ; // might redo
    //     }
    //     if (this.tongueSpeed < 5) {
    //         this.tongueSpeed = 5 ;
    //     } 
    //     isFroglet() ;
    //     return;
    // }

    public void grow(int months) {
        for (int i = 0; i < months; i++) {
            age += 1;
            if (age <= 12) {
                tongueSpeed += 1;
            } else if (age >= 30) {
                tongueSpeed -= 1 ;
            } else {
                // nothing
            }
            if (tongueSpeed < 5) {
                 tongueSpeed = 5 ;
        } else {
            // nothing
        }
    
        }
    }

    // takes in no parameters and ages the Frog by one month 
    // and updates tongueSpeed accordingly as for the other grow method
    public void grow() {
        // age += 1 ;
        // tongueSpeed += 1 ;
        grow(1) ;
    }

    public void eat(Fly Fly) {
        while (!Fly.isDead()) {
            if (this.tongueSpeed > Fly.getSpeed() && Fly.getMass() > age * 0.5) {
                grow() ;
                Fly.setMass(0) ;
            } else {
                Fly.setMass(Fly.getMass() +1) ;
            }
            Fly.setSpeed(Fly.getSpeed() +1) ;
        } //might need more here
    }

    public String toString () {


        if (isFroglet == true){
        //    return  "My name is "+ String.format(name)+ "and I’m a rare froglet! "+String.format("%.2d",age)+" months old and my tongue has a speed of "+String.format("%.2f",tongueSpeed) ;
        // } else {
        //     return "My name is "+ String.format(name)+ "and I’m a rare frog! "+String.format("%.2f",age)+" months old and my tongue has a speed of "+String.format("%.2f",tongueSpeed) ;
    
        // }

        return "My name is " + name + " and I’m a rare froglet. I'm " + age + " months old and my tongue has a speed of " + String.format("%.2f", tongueSpeed)+".";
    } else {
        return "My name is " + name + " and I’m a rare frog. I'm " + age + " months old and my tongue has a speed of " + String.format("%.2f", tongueSpeed)+".";
    }
    }

    public static String getSpecies() {
        return species ; 
    }

    public static void setSpecies(String newSpecies) {
        species = newSpecies ;
    }
    
}