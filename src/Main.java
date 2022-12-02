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
            System.out.println("What is your birthday? (Type in format \"month/day/year\"):");
            birthday = s.nextLine();
            yourContact = new Contact(name,number,address,birthday);
        }

        //Things to do
        String answer2 = "";
        yourContact.printInstructions();
        Thread.sleep(4000);
        while (!answer2.equals("quit")) {
            answer2 = "";
            System.out.print("What would you like to do?: ");
            answer2 = s.nextLine();
            if (answer2.equals("get info")) {
                yourContact.printInfo();
            } else if (answer2.equals("view instructions")) {
                yourContact.printInstructions();
            } else if (answer2.equals("change address")) {
                System.out.print("Please enter your new address: ");
                String newAddress = s.nextLine();
                yourContact.changeAddress(newAddress);
            } else if (answer2.equals("change number")) {
                System.out.print("Please enter your new number (Type in format \"123-456-7890\"): ");
                String newNumber = s.nextLine();
                yourContact.changeNumber(newNumber);
            } else if (answer2.equals("change birthday")) {
                System.out.print("Please enter your new birthday (Type in format \"month/day/year\"): ");
                String newBirthday = s.nextLine();
                yourContact.changeBirthday(newBirthday);
            } else if (answer2.equals("generate number")) {
                System.out.println("New number has been generated! Type \"get info\" to view your new number.");
                yourContact.changeNumber(yourContact.generateNumber());
            } else if (answer2.equals("days until birthday")) {
                System.out.print("What is today's date (Type in format \"month/day\"): ");
                String todayDate = s.nextLine();
                yourContact.daysUntilBday(todayDate);
            } else if (answer2.equals("quit")) {
                System.out.println("Thanks for being here!");
            } else {
                System.out.println("We cannot resolve your request, please check your syntax and retype your request.");
            }
        }


    }
}