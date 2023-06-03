package veterinary;

public class Dog extends Pet {
    private double droolRate;

    public Dog(String name, double health, int painLevel, double droolRate) {
        super(name, health, painLevel) ;
        if (droolRate <= 0) {
            this.droolRate = 0.5;
        }
    }

    public Dog(String name, double health, int painLevel) {
        super(name, health, painLevel) ;
        droolRate = 5.0;
    }

    public double getDroolRate() {
        return droolRate;
    }

    public int treat() {
        int minutes;
        if (droolRate < 3.5) {
            minutes =  (int) Math.ceil((getPainLevel() * 2) / (int) getHealth()) ;
        } else if  (droolRate >= 3.5 && droolRate <= 7.5) {
            minutes = (int) Math.ceil((getPainLevel() )/ (int) getHealth() ) ; 
        } else if (droolRate > 7.5) {
            minutes = (int) Math.ceil(getPainLevel() / ( (int) getHealth() * 2) ) ;
        } else {
            return 1 ; 
        }
        heal();
        return minutes ;
         
    }

    public void speak() {
        super.speak() ;
        if (getPainLevel() > 5) {
            for (int i = 1; i <= getPainLevel(); i++ ) {
                System.out.print("BARK") ;
            }
        } else {
            for (int i = 1; i <= getPainLevel(); i++ ) {
                System.out.print("bark ") ;
            }
        }
    }

    public boolean equals(Object o) {
        return (super.equals(o) && (((Dog) o).droolRate == droolRate)) ;
    }
}
