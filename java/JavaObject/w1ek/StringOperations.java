public class StringOperations {
    public static void main(String[] args) {
        // A
        String newString = "String" ;
        System.out.println(newString);

        // B
        String newerString = 'A' + newString.substring(1,5) + 'Z' ;
        System.out.println(newerString);

        // C
        String url = "www.gatech.edu" ; 
        System.out.println(url);

        // D
        String url1331 = url.substring(4,10) + "1331" ;
        System.out.println(url1331);
    }
    
    //TODO: Start your code after this line
}
