public class LeapYear {

   static int year = 1900;

    public static void main(String args[])
    {
       if(year%4 == 0)
       {
           System.out.println(year+" is a leap year.");
       }else
           {
           System.out.println(year+" is not a leap year.");
           }
    }

}
