import java.util.Scanner;

public class OddOrEven {
    public static void main (String args[]){
//        int number = 15;
//        int b = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = scanner.nextInt();

//        if (number%2==0)
//            System.out.println(number+": even.");
//        else {
//            System.out.println(number+": odd.");
//        }



//        if( number%2 ==0 )
//        System.out.println(number +" is even number");
//        else
//        {
//            System.out.println(number+ " is odd number");
//         }

        String EvenOdd = (number%2==0)?"even":"odd";
        System.out.println(number+" is "+ EvenOdd);


        }


    }



