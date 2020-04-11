import java.util.Scanner;
public class TestStudent {

        public static void main (String [] args) {

            Scanner gk = new Scanner(System.in);
            String matricNo;
            double test1,test2;

            Student [] studDegree = new Student[3];
            //complete your code here

            for(int i=0;i<studDegree.length;i++) {

                System.out.print("Matric No : ");
                matricNo = gk.next() + gk.nextLine();
                System.out.print("Test 1 : ");
                test1 = gk.nextDouble();
                System.out.print("Test 2 : ");
                test2 = gk.nextDouble();
                studDegree[i] = new Student(matricNo, test1, test2);
            }

                System.out.println("****************************");
                System.out.println("    STUDENT INFORMATION   ");
                System.out.println("****************************");
                System.out.println("Matric No\t\tAverageMark");
                for(int j=0;j<3;j++){
                    studDegree[j].calculateAverage();
                    System.out.println(studDegree[j].getStudentInfo());
                }
        }//end of main method
}//end of class TestStudent
