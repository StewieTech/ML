// comment

// public class first {
//     public static void main(String[] args) {
//         System.out.println("Hello, World");
//     }
// }

public class first {
    public static void main(String[] args) {
        String funnyStr = "Computer!Science,!long!walks!on!the!beach";
        int a = funnyStr.indexOf(33);
        int b = funnyStr.indexOf('!'); // Unicode characters converted
        int c = funnyStr.indexOf("!");
        int d = funnyStr.indexOf("!Science");
        int e = funnyStr.indexOf("!Science,!long");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
;    }

}

// print(main);