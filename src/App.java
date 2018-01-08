import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String name;
    String ticker;
    String otc;
    double price;
    double daychange;
    double volume;
    double beta;
    double mktcap;

    System.out.println("Enter the company name.");
    name = input.nextLine();
    System.out.println("Enter the ticker symbol.");
    ticker = input.nextLine();
    System.out.println("Is this an over the counter security? (Enter Yes or No)");
    otc = input.next();
    System.out.println("What is the current trading price? (Enter in x.xx format)");
    price = input.nextDouble();
    System.out.println("How much has the price of the security changed today? (Enter in x.xx format)");
    daychange = input.nextDouble();
    System.out.println("What is today's trading volume?");
    volume = input.nextDouble();
    System.out.println("What is the total company market capitalization?");
    mktcap = input.nextLong();
    System.out.println("What is the security's beta?");
    beta = input.nextDouble();




    double volumeval = (price*volume);
    double daypercent = (daychange/price);
    double daypercentfinal = (daypercent*100);
    double sharesout = (mktcap/price);
    double ownership = (1/sharesout);
    double ownershippercent = (ownership*100);



        System.out.printf("Details for Company: " + name);
        System.out.printf(". (" + ticker);
        System.out.printf(").");
        System.out.println();
        System.out.println("_________________________");
        System.out.println();
        {
            if (otc.equals("Yes")) {
                System.out.println("This is an over the counter security.");
            } else if (otc.equals("yes")) {
                System.out.println("This is an over the counter security.");
            } else {
                System.out.println("This security trades on the regular exchange.");
            }
        }
        System.out.printf("The current stock price is: $" + "%.2f%n", price);
        System.out.printf("The stocks beta is: " + "%.2f%n", beta);
        System.out.printf("The stock price has moved " + "%.2f", daypercentfinal);
        System.out.println("% today.");
        System.out.printf("Todays trading volume is " + "%.0f", volume);
        System.out.printf(" shares.");
        System.out.println();
        System.out.printf("The value of transactions today is: $" + "%.2f%n", volumeval);
        System.out.println();
        System.out.println("The total market capitalization is: $" + mktcap);
        System.out.printf("There are currently " + (sharesout));
        System.out.printf(" shares outstanding.");
        System.out.println();
        System.out.printf("Each share represents " + "%.0f", ownershippercent);
        System.out.println("% of ownership in the company");
        System.out.println();
        System.out.println("Have a fantastic fucking day. (☞ﾟヮﾟ)☞ ");







    }
}
