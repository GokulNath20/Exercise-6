import java.util.Scanner;
public class TestBook {
    public static void main (String [] args) {

        Scanner gk= new Scanner(System.in);
        int n;
        String title, highestPriceBook="";
        double price,highestPrice=0;

        System.out.print("Please enter the number of books: ");
        n = gk.nextInt();

        Book [] myLibrary = new Book[n];

        for (int i=0;i<n;i++){

            System.out.print("Title: ");
            title = gk.next()+gk.nextLine();

            System.out.print("Price: RM ");
            price = gk.nextDouble();

            myLibrary[i] = new Book(title,price);

            if (myLibrary[i].getPrice()>highestPrice){
                highestPrice = myLibrary[i].getPrice();
                highestPriceBook = myLibrary[i].getTitle();
            }
        }
        System.out.printf("\"%s%s%.2f\n", highestPriceBook , "\" has the highest price with RM " , highestPrice);


        String zz="Books that contain the term “Java” in their title:";
        String gg="There are no books that contain the term “Java” in their title";

        for(int i=0;i<n;i++) {

            if (myLibrary[i].getTitle().indexOf("Java") != -1)
                gg=zz;
        }
            System.out.println(gg);

        for(int j=0;j<n;j++){

            if(myLibrary[j].getTitle().indexOf("Java")!=-1)

                System.out.println(myLibrary[j].getTitle());
        }
    }
}
