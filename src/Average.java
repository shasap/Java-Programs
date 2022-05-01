public class Average {
    public static void average(double a, double b, double c, double d, double e){
        double ave = (a+b+c+d+e)/5;
        System.out.println("Average of "+a+", "+b+", "+c+", "+d+" & "+ e+" is "+ ave);
        }


    public static void main(String[] args) {

        average(25.00,35.2,80.0,90.22,11.8);
    }

}