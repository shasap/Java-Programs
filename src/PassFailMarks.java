import com.sun.deploy.security.SelectableSecurityManager;

public class PassFailMarks {

    public static void result(String name, int rollNo, double english, double science, double maths ){

        // Maximum total marks of 3 subjects are 300
        double maximumTotalMarks = 300;
        double receivedTotalMarks = english+science+maths;
        double percentage = (receivedTotalMarks/maximumTotalMarks)*100;
        System.out.println("Name: "+name+", Roll Number: "+rollNo+", Marks of English: "+english+", Science: "+science+" & Maths: "+maths);
        System.out.println(name+"'s Total Marks = "+receivedTotalMarks+" and Percentage = "+percentage+"%");


        if(english>=35 && science>=35 && maths>=35 && percentage>=80)
        {
            System.out.println(name+" is pass and has got A+ Grade.");
        }
        else if (english>=35 && science>=35 && maths>=35 && percentage>=60)
        {
            System.out.println(name+" is pass and has got A Grade.");
        }
        else if(english>=35 && science>=35 && maths>=35 && percentage>=50)
        {
            System.out.println(name+" is pass and has got B Grade.");
        }
        else if(english>=35 && science>=35 && maths>=35 && percentage>=35)
        {
            System.out.println(name+" is pass and has got C Grade.");
        }else
            {
                System.out.println(name+" is fail.");
            }
    }

    public static void main(String[] args) {
        result("Andrew",1,33,44,77);
        System.out.println("____________________");
        result("Brian",2,75,81,87);
        System.out.println("____________________");
        result("Charlie",3,77,27,37);
    }
}
