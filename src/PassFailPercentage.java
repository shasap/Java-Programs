public class PassFailPercentage {


    public static void result(String name, int rollNo, int Eng, int Maths, int Sci){

        // Maximum Total Marks of 3 Subjects = 300
        int maximumTotalMarks = 300;
        double receivedTotalMarks= Eng+Maths+Sci;
        double percentage = (receivedTotalMarks/maximumTotalMarks)*100;

        System.out.println("Name: "+name +", Roll number: "+rollNo+ ", Marks of English = "+ Eng+ ", Maths = "+Maths +" and Science = "+ Sci +" & Total Marks = "+(Eng+Maths+Sci));

        System.out.println(name+"'s percentage is "+percentage);

//       if(percentage>=35)
//       {
//            System.out.println(name+" is pass.");
//       }else {
//           System.out.println(name+" is fail." );
//       }


        if(percentage>=35 && percentage>=80)
        {
            System.out.println(name+" is pass and has got A+ Grade.");
        }
        else if(percentage>=35 && percentage>=60)
        {
            System.out.println(name+" is pass and has got A Grade.");
        }
        else if (percentage>=35 && percentage>=50)
        {
            System.out.println(name+" is pass and has got B Grade.");
        }
        else if (percentage>=35)
        {
           System.out.println(name+" is pass and has got C Grade.");
        }
        else
            {
                System.out.println(name+" is fail.");
            }

    }
    public static void main (String args[]){

        result("Steve",5,25,75,65);
        System.out.println("__________________________");
        result("Alex",1,85,95,90);
        System.out.println("__________________________");
        result("Charlie",3,57,78,66);
        System.out.println("__________________________");
        result("David",4,48,51,45);
        System.out.println("__________________________");
        result("John",2,30,33,27);


    }

}