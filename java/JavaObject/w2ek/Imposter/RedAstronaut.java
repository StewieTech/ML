package w2ek.Imposter;


import java.text.Format;
import java.util.Arrays;

public class RedAstronaut extends Player implements Impostor {

    private final String skill ; 

//     A constructor that takes in the name, susLevel, and skill and sets all fields accordingly. It must accept the variables in the specified order. Assume that the passed in parameter for skill will be one of the three values, although it may have different capitalization.
// Hint: There is a specified keyword in L12 to access the superclass’s constructor.
    public RedAstronaut(String name, int susLevel, String skill) {
        super(name, susLevel);
        this.skill = skill.toLowerCase() ;


    }

    // A constructor that takes in just a name and assigns the following default values:
    public RedAstronaut(String name) {
        super(name, 15) ;
        skill = "experienced" ;
    }

    // Do not create any other methods than those specified.

    // @Override
    // public void emergencyMeeting() {
    //     Player mostSus = null ;
    //     int maxSusLevel = 0;
    //     if (!isFrozen()) {
    //         for (Player p : players) {
    //             if (!p.isFrozen && p != this && p.susLevel() > maxSusLevel) {
    //                 maxSusLevel = p.getSusLevel() ;
    //                 mostSus = p ;
    //             }
    //         }
    //         if(mostSus != null) {
    //             for (Player p : players) {
    //                 if (p!= this && p.getSusLevel() == maxSusLevel) {
    //                     return ;
    //                 }
    //             }
    //             mostSus.setFrozen(true);
    //             System.out.println("Player "+mostSus.getName() + " was voted off.");
    //             GameOver();
    //         }
    //     }
    // }

        
    @Override
    public void emergencyMeeting() {
        Player mostSus = null ;
        int maxSusLevel = 0;
        if (this.isFrozen()) {
            for (Player p : Player.getPlayers()) {
                if (!p.isFrozen() && p != this && p.getSusLevel() > maxSusLevel) {
                    maxSusLevel = p.getSusLevel() ;
                    mostSus = p ;
                }
            }
            if(mostSus != null) {
                for (Player p : Player.getPlayers()) {
                    if (p!= this && p.getSusLevel() == maxSusLevel) {
                        return ;
                    }
                }
                mostSus.setFrozen(true);
                System.out.println("Player "+mostSus.getName() + " was voted off.");
                gameOver();
            }
        }
    }



    public void freeze(Player p) {
        if (!p.isFrozen() || !p.isFrozen() || !(p instanceof Impostor)) {
            if(getSusLevel() < p.getSusLevel() ) {
                p.setFrozen(true);
                return ;
            } else {
                p.setSusLevel(getSusLevel() * 2);
            }
            gameOver(); 
        }
    }

    @Override
    public void sabotage(Player p) {
        if (!isFrozen() || !p.isFrozen() || !(p instanceof Impostor)) {
            int moreSus;
            if (getSusLevel() < 20) {
                moreSus = (int) Math.round(p.getSusLevel() * 0.5);
                // Cremate.susLevel += 20 ;
            } else {
                moreSus = (int) Math.round(p.getSusLevel() *0.25) ;
            }
            p.setSusLevel(p.getSusLevel() + moreSus) ;
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RedAstronaut)) {
            return false;
        }
        RedAstronaut other = (RedAstronaut) o;
        return super.equals(other) && skill.equals(other.skill) ;
    }

    // public String toString() {
    //     if (susLevel <= 15) {
    //         return "My name is " + name + ", and I have a suslevel of " +susLevel+". I am currently (frozen / not frozen). I am an "+ skill+"player!" ;
    //     } else {
          
        
    //     }
    // }
    public String toString() {

        String status = isFrozen() ? "frozen" : "not frozen";
        if (getSusLevel() <= 15) {
            return "My name is " + getName() + ", and I have a suslevel of " + getSusLevel() + ". I am currently " + status + ". I am a " + skill + " player!";
        } else {
            return "My name is " + getName() + ", and I have a suslevel of " + getSusLevel() + ". I am currently " + status + ". I am a " + skill.toUpperCase() + " player!";
        }
    }
    


    }

