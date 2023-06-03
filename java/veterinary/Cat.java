package veterinary;

public class Cat extends Pet{
    private int miceCaught;

    public Cat(String name, double health, int painLevel, int miceCaught) {
        super(name, health, painLevel) ;
        this.miceCaught = (miceCaught < 0) ? miceCaught = 0  : miceCaught ;

    }
    public Cat(String name, double health, int painLevel) {
        super(name, health, painLevel) ;
        this.miceCaught = 0;
    }

    public int getMiceCaught() {
        return miceCaught ;
    }

    public int treat() {
        int minutes;
        if (miceCaught < 4) {
            minutes =  (int) Math.ceil((getPainLevel() * 2) / (int) getHealth()) ;
        } else if  (miceCaught >= 4 && miceCaught <= 7) {
            minutes = (int) Math.ceil((getPainLevel() )/ (int) getHealth() ) ; 
        } else if (miceCaught > 7.5) {
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
                System.out.print("MEOW ") ;
            }
        } else {
            for (int i = 1; i <= getPainLevel(); i++ ) {
                System.out.print("meow ") ;
            }
        }
    }

    public boolean equals(Object o) {
        return (super.equals(o) && (((Cat) o).miceCaught == miceCaught)); 
    }
}
