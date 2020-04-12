import java.util.Scanner;
    public class Average{
        public static void main (String[] args){
            Scanner gk = new Scanner(System.in);

            int a,b,c,d;

            System.out.println("Please enter 3 integers");
            System.out.print("Integer 1: ");
            a = gk.nextInt();
            System.out.print("Integer 2: ");
            b = gk.nextInt();
            System.out.print("Integer 3: ");
            c = gk.nextInt();
            System.out.printf("The average for 3 integers: %.2f%n", average(a,b,c));

            System.out.print("Enter one more integer: ");
            d = gk.nextInt();
            System.out.printf("The average for 4 integers: %.2f",average(a,b,c,d));
        }

            public static double average(int a,int b,int c){
                double average = ((double)(a+b+c))/3;
                return average;
            }

            public static double average(int a,int b,int c,int d){
                double average = ((double)(a+b+c+d))/4;
                return average;
            }
        }
