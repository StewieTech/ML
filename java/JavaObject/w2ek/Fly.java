package w2ek;

public class Fly {
    private double mass;
    private double speed;

    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed=speed;
    }
    
    public Fly(double mass) {
        this(mass,10);
    }

    public Fly() {
        this(5,10);
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }



    public String toString() {

        if (mass == 0) {
            return "I'm dead, but I used to be a fly with speed of " + String.format("%.2f", speed) + ".";

        } else {
            return "I'm a speedy fly with " +String.format("%.2f", speed)+" speed and " +String.format("%.2f", mass) + " mass.";
        }
    }

    public void grow(int addedMass) {
        this.mass = mass + addedMass;

        if (mass < 20 && 20 - mass > 0) {
            this.speed = (20 - mass) + speed ;
        } else if (mass >= 20) {
            this.speed = ((20 - mass) * -0.5) ;
        }

    }
    public boolean isDead() {
        if (mass == 0) {
            return true ;
        } else {
            return false ;
        }
    }

    }
