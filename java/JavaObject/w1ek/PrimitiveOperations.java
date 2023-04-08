public class PrimitiveOperations {
    public static void main(String[] args) {
        int first = 2;
        float second = 3 ;
        System.out.println(first);
        System.out.println(second);

        // B
        double multi = first * second ;
        System.out.println(multi);

        // C
        float floatNow = first ;
        System.out.println(floatNow);

        // D 
        int intNow = (int) second ;
        System.out.println(intNow);

        // E
        char oneUpper = 'E' ;
        System.out.println(oneUpper);

        // F
        int oneLower = (int)oneUpper + 32 ;
        char oneLowerTwo = (char) oneLower ;
        System.out.println(oneLowerTwo);
        // oneLower = oneLower + 26 ;
    }

}