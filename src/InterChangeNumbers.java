public class InterChangeNumbers {
    static int no1 = 10;
    static int no2 = 5;
    static int temp;
    public static void main(String args[]){
        System.out.println("Before swapping no1 = "+no1 +" & no2 = "+no2);
        temp = no1;
        no1 = no2;
        no2 = temp;
        no1 += no2;
        no2 = no2 - no1;

        System.out.println("After swapping no1 = "+no1 +" & no2 = "+no2);

    }

}

