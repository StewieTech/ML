package veterinary;

public abstract class Pet {
    private String name;

    // A percentage value ranging from 0.0 to 1.0
    private double health;
    // Ranges from 1 to 10
    private int painLevel;
    // Should be an abstract method that returns the time taken (in minutes) to treat the pet
    // private int treat;

    public Pet(String name, double health, int painLevel) {
        if (health > 1.0) {
            this.health = 1.0;
        } else if (health < 0.0) {
            this.health = 0.0;
        } else {
            this.health = health;
        }

        if (painLevel > 10) {
            this.painLevel = 10;
        } else if (painLevel < 1.0) {
            this.painLevel = 1;
        } else {
            this.painLevel = painLevel;
        }

    }

        public String getName() {
            return name;
        }

        public double getHealth() {
            return health;
        }

        public int getPainLevel() {
            return painLevel;
        }

        public abstract int treat() ;

        // message = System.out.println("Hello! My name  is " + name);
        
        public void speak() {
            String message = "Hello! My name is " + name;
            if (painLevel > 5) {
                System.out.println(message.toUpperCase());
            } else {
                System.out.println(message) ;
            }
        }

        public boolean equals(Object o) {
            if (o == null) {
                return false;
            }
            if (!(o instanceof Pet)) {
                return false;
            }
            Pet otherPet = (Pet) o ;
            return (otherPet.name.equals(name)) ;
        }

        protected void heal() {
            health = 1.0;
            painLevel = 1;
        }
}

