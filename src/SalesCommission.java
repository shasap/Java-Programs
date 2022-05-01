public class SalesCommission {
      public static void commission(String sellerID, String sellerName,double salesAmount, double basicSalary ) {
          System.out.println("ID: "+sellerID+" - Name: "+sellerName+" - Sales Amount: £"+salesAmount+" - Basic Salary: £"+basicSalary );

          if (salesAmount>=50000)
          {
              double percentage = basicSalary*35/100;
              System.out.println("Sales commission is " + percentage+".");
          }
          else if(salesAmount>=30000)
          {
              double percentage = basicSalary*20/100;
              System.out.println("Sales commission is " + percentage+".");
          }
          else if(salesAmount>=20000)
          {
              double percentage = basicSalary*10/100;
              System.out.println("Sales commission is " + percentage+".");
          }
          else if(salesAmount>=10000)
          {
              double percentage = basicSalary*5/100;
              System.out.println("Sales commission is " +percentage+".");
          }
          else
          {
              double percentage = basicSalary*5/100;
              System.out.println("Sales commission is " +percentage+".");
          }
      }


//        static double basicSalary = 20000;
//        static double salesAmount = 40000;

        public static void main (String args[])
        {
            commission("R123","Vidur",75000,20050);
            commission("R100","Chanak",45000,30000);

        }

}
