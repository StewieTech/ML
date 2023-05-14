package w2ek.Imposter;

public class Gameplay {
    public static void main(String[] args) {
        BlueAstronaut bob = new BlueAstronaut("Bob", 20, 6, 30);
        BlueAstronaut heath = new BlueAstronaut("Heath", 30, 3, 21);
        BlueAstronaut albert = new BlueAstronaut("Albert", 44, 2, 0);
        BlueAstronaut angel = new BlueAstronaut("Angel", 0, 1, 0);
        RedAstronaut liam = new RedAstronaut("Liam", 19, "experienced");
        RedAstronaut suspiciousPerson = new RedAstronaut("Suspicious Person", 100, "expert");

        liam.sabotage(bob);
        System.out.println("Bob after sabotage: " + bob.toString());

        liam.freeze(suspiciousPerson);
        System.out.println("Suspicious Person after freeze: " + suspiciousPerson.toString());

        liam.freeze(albert);
        System.out.println("Liam after freeze: " + liam.toString());
        System.out.println("Albert after freeze: " + albert.toString());

        albert.emergencyMeeting();
        System.out.println("Albert after emergency meeting: " + albert.toString());

        suspiciousPerson.emergencyMeeting();
        System.out.println("Suspicious Person after emergency meeting: " + suspiciousPerson.toString());

        bob.emergencyMeeting();
        System.out.println("Suspicious Person after emergency meeting: " + suspiciousPerson.toString());

        heath.completeTask();
        System.out.println("Heath after completing task: " + heath.toString());

        heath.completeTask();
        System.out.println("Heath after completing task: " + heath.toString());

        heath.completeTask();
        System.out.println("Heath after completing task: " + heath.toString());

        liam.freeze(angel);
        System.out.println("Angel after freeze: " + angel.toString());
        System.out.println("Liam after freeze: " + liam.toString());

        liam.sabotage(bob);
        System.out.println("Bob after sabotage: " + bob.toString());

        liam.sabotage(bob);
        System.out.println("Bob after sabotage: " + bob.toString());

        liam.freeze(bob);
        System.out.println("Bob after freeze: " + bob.toString());

        angel.emergencyMeeting();
        System.out.println("Liam after emergency meeting: " + liam.toString());
        System.out.println("Crewmates win!");

        // OR

        liam.sabotage(heath);
        liam.sabotage(heath);
        liam.sabotage(heath);
        liam.sabotage(heath);
        liam.sabotage(heath);
        System.out.println("Heath after sabotage: " + heath.toString());

        liam.freeze(heath);
        System.out.println("Heath after freeze: " + heath.toString());
        System.out.println("Impostors win!");
    }
}

