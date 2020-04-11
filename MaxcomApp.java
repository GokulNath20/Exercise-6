import java.util.Scanner;
public class MaxcomApp {
    public static void main(String[] args) {
        int duration, category;
        Scanner gk= new Scanner(System.in);

        double charge = 0.0;
        int respond;
        CallChargeCalculator ccc = new CallChargeCalculator();

        do {
            System.out.println("Enter the call duration (in minutes):");
            duration= gk.nextInt();
            System.out.println("Enter Rate Category:  1.Daytime  2.Evening  3.Off-Peak:");
            category= gk.nextInt();

            charge = ccc.computeCharge(duration,category);

            System.out.printf("The amount you have to pay is = RM%.2f%n", charge);
            System.out.println("Do you want to continue? 1.Yes  2.No");
            respond = gk.nextInt();
            System.out.println();

        } while (respond==1);
        System.out.println("Thank you! See you again.");
    }
}
