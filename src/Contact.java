/**
 * The contact class intakes information such as name, number, birthday, and address, and it performs tasks with it.
 */
public class Contact {

    //Instance Variable
    private String name;
    private String number;
    private String address;
    private String birthday;

    /**
     * Contructor for Contact class. This creates a new instance of a person given the below appearance.
     * @param name represents the name of the Person
     * @param number represents the phone number of the Person
     * @param address represents the house address of the Person
     * @param birthday represents the birthday of the Person
     */
    //Constructors
    public Contact(String name, String number, String address, String birthday) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.birthday = birthday;
    }

    /**
     * Overloaded Constructor for Contact class. This creates a new instance of a person if variables except name are not given.
     * @param name represents the name of the Person
     */
    public Contact(String name) {
        this.name = name;
        number = "718-804-6400";
        address = "29 Fort Greene Pl, Brooklyn, NY 11217";
        birthday = "1/1/2006";
    }
    /**
     * Overloaded Constructor for Contact class. This creates a new instance of a person if all variables are not given.
     */
    public Contact() {
        name = "John Doe";
        number = "718-804-6400";
        address = "29 Fort Greene Pl, Brooklyn, NY 11217";
        birthday = "1/1/2006";
    }
    //Methods

    //Getter Methods
    /**
     * Getter method for name variable. This returns the name.
     * @return returns name
     */
    public String getName() {
        return name;
    }
    /**
     * Getter method for name number. This returns the number.
     * @return returns number
     */
    public String getNumber() {
        return number;
    }
    /**
     * Getter method for name address. This returns the address.
     * @return returns address
     */
    public String getAddress() {
        return address;
    }
    /**
     * Getter method for name birthday. This returns the birthday.
     * @return returns birthday
     */
    public String getBirthday() {
        return birthday;
    }

    //Change Methods

    /**
     * Change method for birthday. Returns a new value of birthday.
     * @param newBirthday represents the new birthday of the Person
     * @return returns newBirthday
     */
    public String changeBirthday(String newBirthday) {
        birthday = newBirthday;
        return birthday;
    }
    /**
     * Change method for address. Returns a new value of address.
     * @param newAddress represents the new address of the Person
     * @return returns newAddress
     */
    public String changeAddress(String newAddress) {
        address = newAddress;
        return address;
    }
    /**
     * Change method for number. Returns a new value of number.
     * @param newNumber represents the new number of the Person
     * @return returns newNumber
     */
    public String changeNumber(String newNumber) {
        number = newNumber;
        return number;
    }
    //Extra Methods

    /**
     * Generates a new number randomly and changes the number variable to that new number.
     * @return returns the new number
     */
    public String generateNumber() {
        String newNumber = "";
        for (int i = 0; i<=1; i++) {
            for (int j = 0; j < 3; j++) {
                newNumber += (int) (Math.random() * (9));
            }
            newNumber += "-";
        }
        for (int i = 0; i <= 3; i++) {
            newNumber += (int)(Math.random()*(9));
        }
        return newNumber;
    }

    /**
     * Caculates the number of days from today's date to the Person's birthday.
     * @param todaysDate represents the date of today in format (month/day)
     */
    public void daysUntilBday(String todaysDate) {
        int tdyMonth = Integer.parseInt(todaysDate.substring(0,todaysDate.indexOf("/")));
        int tdyDay = Integer.parseInt(todaysDate.substring(todaysDate.indexOf("/")+1));

        String bday = birthday.substring(0, birthday.length()-5);
        int bdayMonth = Integer.parseInt(bday.substring(0,bday.indexOf("/")));
        int bdayDay = Integer.parseInt(bday.substring(bday.indexOf("/")+1));

        int days = 0;
        int difference = 0;
        int monthOfTdy = tdyMonth;
        int dayOfTdy = tdyDay;
        int dayOfBday = bdayDay;

        if (tdyMonth > bdayMonth) {
            difference = (bdayMonth + 12) - tdyMonth;
        } else {
            difference = bdayMonth - tdyMonth;
        }

        if (difference == 0 && dayOfBday > dayOfTdy) {
            days += dayOfBday - dayOfTdy;
        }
        if (difference == 0 && dayOfBday < dayOfTdy) {
            days += 365 - (dayOfTdy - dayOfBday);
        }

        for (int i = 0; i < difference; i++) {
            if ((monthOfTdy == 1) || ((monthOfTdy <= 7) && (monthOfTdy % 2 == 1)) || ((monthOfTdy >= 8) && (monthOfTdy % 2 == 1))) {
                days += 31;
            } else if (((monthOfTdy <= 7) && (monthOfTdy % 2 == 0) && (monthOfTdy != 2)) || ((monthOfTdy >= 8) && (monthOfTdy % 2 == 0))) {
                days += 30;
            } else {
                days += 28;
            }
            monthOfTdy++;
        }
        if (difference > 0 && bdayDay != tdyDay) {
            days = days - tdyDay + bdayDay;
        }

        if (days == 0) {
            System.out.println("Your birthday is today! Happy Birthday!");
        } else {
            System.out.println("You have " + days + " days until your birthday!");
        }
    }
    //Print methods

    /**
     * toString method for Contact class. This will return a formatted text.
     * @return returns a formatted text that contains information about the contact Person
     */
    public String toString() {
        String returnString = "Name: " + getName() + "\nNumber: "  + getNumber() + "\nAddress: " + getAddress() + "\nBirthday: " + getBirthday();
        return returnString;
    }

    /**
     * printInfo that prints the format of toString method.
     */
    public void printInfo () {
        System.out.println(toString());
    }

    /**
     * prints the instruction for Main class.
     */
    public void printInstructions() {
        System.out.println("Things you can do: (NOTE: Everything you type is case sensitive)");
        System.out.println("------View-Information------");
        System.out.println("Get your information: (Type \"get info\")");
        System.out.println("View instructions: (Type \"view instructions\")");
        System.out.println("------Change-Information------");
        System.out.println("Change your address: (Type \"change address\")");
        System.out.println("Change your birthday: (Type \"change birthday\")");
        System.out.println("Change your number: (Type \"change number\")");
        System.out.println("------Special-Tasks------");
        System.out.println("Randomly generate a new number: (Type \"generate number\")");
        System.out.println("Days until your next birthday: (Type \"days until birthday\")");
        System.out.println("------Quit------");
        System.out.println("To end the program: (Type \"quit\")");
    }
}
