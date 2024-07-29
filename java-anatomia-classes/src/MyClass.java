public class MyClass {
    
    public static void main (String [] args) {
        String firsName = "Marcelo";
        String secondName = "Henrique";

        String nameFull = nameFull(firsName, secondName);
        System.err.println(nameFull);
    }
    public static String nameFull (String firstName, String secondName) {
        return firstName.concat(" ").concat(secondName);
    }
}
