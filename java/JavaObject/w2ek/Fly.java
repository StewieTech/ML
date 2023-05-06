package w2ek;

public class Fly {
    private double mass;
    private double speed;

    private static final int initialMass = 5;
    private static final int initialSpeed = 10;

    public Fly() {
        this(initialMass) ;
    }

    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed=speed;
    }
    
    public Fly(double mass) {
        this(mass,initialSpeed);
    }

    // public Fly() {
    //     this(5,10);
    // }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        if (mass >= 0) {
            this.mass = mass;
        }
        
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed >= 0) {
            this.speed = speed;
        }

    }



    public String toString() {

        if (mass == 0) {
            return "I'm dead, but I used to be a fly with speed of " + String.format("%.2f", speed) + ".";

        } else {
            return "I'm a speedy fly with " +String.format("%.2f", speed)+" speed and " +String.format("%.2f", mass) + " mass.";
        }
    }

    // public void grow(int addedMass) {
    //     this.mass = mass + addedMass;

    //     if (mass < 20 && 20 - mass > 0) {
    //         this.speed = (20 - mass) + speed ;
    //     } else if (mass >= 20) {
    //         this.speed = ((20 - mass) * -0.5) ;
    //     }

    // }

    public void grow(int addedMass) {
        if (mass>= 20) {
            speed -= 0.5 * addedMass ;
        } else if (mass + addedMass < 20) {
            speed+= addedMass;
        } else {
            int before = 20 - (int) mass;
            int after = (int) mass + addedMass - 20;
            speed += before - 0.5 * after ;
        }
        mass += addedMass ;

    }

    public boolean isDead() {
        if (mass == 0) {
            return true ;
        } else {
            return false ;
        }
    }

    }
