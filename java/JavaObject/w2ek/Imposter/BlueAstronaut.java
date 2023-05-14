package w2ek.Imposter;

// import java.util.Arrays;


public class BlueAstronaut extends Player implements Crewmate{
    private int numTasks;
    private int taskSpeed;
    // private static int name;

    public BlueAstronaut(String name, int susLevel, int numTasks, int taskSpeed) {
        super(name, susLevel) ;
        this.numTasks = numTasks ;
        this.taskSpeed = taskSpeed ;

    }

        public BlueAstronaut(String name) {
            super(name, 15);
            this.numTasks = 6;
            this.taskSpeed = 10;

        }

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

        public void completeTask() {
            if (!this.isFrozen()) {
                if (taskSpeed > 20) {
                    numTasks -= 2;
                } else {
                    numTasks --;
                }
                if (numTasks < 0) {
                    numTasks = 0;
                }
                if (numTasks == 0) {
                    System.out.println("I have completed all my tasks");
                    setSusLevel((int) (getSusLevel() * 0.5));
                }
            }

        }

        public boolean equals(Object o) {
            if (o instanceof BlueAstronaut) {
                BlueAstronaut other = (BlueAstronaut) o;
                return this.getName().equals(other.getName())
                    && this.isFrozen() == other.isFrozen()
                    && this.getSusLevel() == other.getSusLevel()
                    && this.numTasks == other.numTasks
                    && this.taskSpeed == other.taskSpeed;
            }
            return false;

        }

        public String toString() {
            String status = this.isFrozen() ? "frozen" : "not frozen";
            String susLevelStr = this.getSusLevel() > 15 ? Integer.toString(this.getSusLevel()).toUpperCase() : Integer.toString(this.getSusLevel());
            return super.toString() + String.format(" I have %d left over.", numTasks);
            // return "My name is [name], and I have a suslevel of [susLevel]. I am currently (frozen / not frozen). I have [numTasks] left over.".format(name, susLevel, frozen)
        }

        public int getNumTasks() {
            return numTasks;
        }

        public int getTaskSpeed() {
            return taskSpeed;
        }

        // public setName(String name) {
        //     this.name = name;

        // public setNumTasks(int numTasks) {
        //     this.numTasks = numTasks;
        // }

        // public setTaskSpeed(int taskSpeed) {
        //     this.taskSpeed = taskSpeed;
        // }
}
