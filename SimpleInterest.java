import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Principal Amount");
        double principal ;
        principal = sc.nextDouble();

        System.out.println("Enter The Rate");
        double  rate;
        rate = sc.nextDouble();


        System.out.println("Enter The time");
        double time;
        time = sc.nextDouble();

        double SimpleInterest;

        SimpleInterest = (principal*rate*time)/100;

        System.out.println("Simpel Interest is: " + SimpleInterest);

    }
    
}
