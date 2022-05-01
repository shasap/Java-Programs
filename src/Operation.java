public class Operation {
    public static void addition(int a,int b){
        System.out.println("Addition of "+a+" + "+b+" = "+(a+b));
    }
    public static void subtraction(int a, int b){
        System.out.println("Subtraction of "+a+" - "+b+" = "+(a-b));
    }
    public static void division (int a, int b){

        System.out.println("Division of "+a+"/"+b+" = "+(a/b));
    }
    public static void multiplication(int a, int b){

        System.out.println("Multiplication of "+ a+"*"+b+" ="+ (a*b));
    }
    public static void main(String[] args) {
        char ch='/';

        if(ch =='+')
        {
            addition(10,5);
        }
        else if(ch == '-')
        {
            subtraction(10,5);
        }
        else if(ch =='/')
        {
            division(10,5);
        }
        else if (ch=='*')
        {
            multiplication(10,5);
        }
        else
            {
                System.out.println("Symbol is invalid.");
            }

    }
}
