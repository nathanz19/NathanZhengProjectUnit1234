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
        if (!name.equals("")) {
            System.out.println("Now you will be entering your information.");
            Thread.sleep(2000);
            String answer1 = "";
            while ((!answer1.equals("yes")) && (!answer1.equals("no"))) {
                System.out.println("Do you want to type in your personal info? (Type \"no\" and default information will be applied; otherwise, type \"yes\")");
                answer1 = s.nextLine();
                if ((!answer1.equals("yes")) && (!answer1.equals("no"))) {
                    System.out.println("Please answer using \"yes\" or \"no\"");
                    Thread.sleep(2000);
                }
            }
        }

        //Other info
//        String birthday;
//        String number;
//        String address;
//        Contact yourContact = new C
//        if ((name.equals(""))) {
//            Contact yourContact = new Contact();
//        } else if (answer1.equals("no")){
//            Contact yourContact = new Contact(name);
//        } else {
//            Contact your
//        }

    }
}