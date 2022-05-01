public class Salary {
    public static void salary(String employee_id,String name, double basic_salary ){

        double hra = (basic_salary*10)/100; // 10% of basic salary
        double da = (basic_salary*8)/100;   // 8% of basic salary
        double ta = (basic_salary*9)/100;   // 9% of basic salary
        double pf = (basic_salary*20)/100;  // 20% of basic salary
        double gross_salary = basic_salary+hra+da+ta-pf;

        System.out.println("Name: "+name+" - Employee ID: "+employee_id+" - HRA: £"+hra+" - DA: £"+da+" - TA: £"+ta +" - PF: £"+pf+" - Gross Salary: £"+gross_salary );

    }

    public static void main(String[] args) {

        salary("LC001","Edward",1000);
    }
}
