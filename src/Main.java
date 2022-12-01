import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the best Contact Book!");
        Thread.sleep(2000);
        //Name
        System.out.println("What is the name? (If you want a default name, click " + "\"" + "ENTER" + "\"" + ")");
        String name = s.nextLine();

        //Information
        String answer1 = "";
        if (!name.equals("")) {
            System.out.println("Now you will be entering your information.");
            Thread.sleep(2000);
            while ((!answer1.equals("yes")) && (!answer1.equals("no"))) {
                System.out.println("Do you want to type in your personal info? (Type \"no\" and default information will be applied; otherwise, type \"yes\")");
                answer1 = s.nextLine();
                if ((!answer1.equals("yes")) && (!answer1.equals("no"))) {
                    System.out.println("Please answer using \"yes\" or \"no\"");
                    Thread.sleep(2000);
                }
            }
        }

        String birthday = "";
        String number = "";
        String address = "";
        Contact yourContact = new Contact();
        if (!(name.equals("")) && answer1.equals("no")) {
            yourContact = new Contact();
        } else if (!(name.equals("")) && answer1.equals("yes")) {
            System.out.println("What is your number? (Type in format \"123-456-7890\"):");
            number = s.nextLine();
            System.out.println("What is your address?:");
            address = s.nextLine();
            System.out.println("What is your birthday? (Type in format \"month/day/year\")");
            birthday = s.nextLine();
            yourContact = new Contact(name,number,address,birthday);
        }
        System.out.println(yourContact.toString());
        yourContact.daysUntilBday("1/9");

    }
}