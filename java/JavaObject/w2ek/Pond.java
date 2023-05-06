package w2ek;

public class Pond {
    public static void main(String[] args) {

        Frog peepo = new Frog("Peepo") ;
        Frog pepe = new Frog("Pepe" , 10, 15) ;
        Frog peepaw = new Frog("Peepaw",  4.6, 5) ;
        Frog myLiking = new Frog("My Liking", 12, 30) ;
        
        Fly one = new Fly(1,3) ;
       Fly two =   new Fly(6) ;
       Fly three =  new Fly(7) ;
        
        Frog.setSpecies("1331 Frogs") ;
        System.out.println(peepo.toString()) ;
        peepo.eat(two);
        System.out.println(two.toString());
        peepo.grow(8);
        peepo.eat(two);
        System.out.println(two.toString());
        System.out.println(peepo.toString());
        System.out.println(myLiking.toString());
        peepaw.grow(4);
        System.out.println(peepaw.toString());
        System.out.println(pepe.toString());


    }

}
