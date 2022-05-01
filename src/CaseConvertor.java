public class CaseConvertor {
    public static void main(String args[]){
        char uppercase ='A';
        // char lowercase = 'a';

        System.out.println("Uppercase alphabet before converting is "+uppercase+".");


        //uppercase = lowercase;
        //System.out.println("Uppercase alphabet after converting is "+uppercase+".");

        char lowercase = Character.toLowerCase(uppercase);
        System.out.println("Uppercase alphabet after converting is "+lowercase+".");

    }
}
