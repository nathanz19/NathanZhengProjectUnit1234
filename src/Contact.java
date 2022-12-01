public class Contact {

    //Instance Variable
    private String name;
    private String number;
    private String address;
    private String birthday;

    //Constructors
    public Contact(String name, String number, String address, String birthday) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.birthday = birthday;
    }
    public Contact(String name) {
        this.name = name;
        number = "718-804-6400";
        address = "29 Fort Greene Pl, Brooklyn, NY 11217";
        birthday = "1/1/2006";
    }
    public Contact() {
        name = "John Doe";
        number = "718-804-6400";
        address = "29 Fort Greene Pl, Brooklyn, NY 11217";
        birthday = "1/1/2006";
    }
    //Methods

    //Getter Methods
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public String getAddress() {
        return address;
    }
    public String getBirthday() {
        return birthday;
    }

    //Change Methods
    public String changeBirthday(String newBirthday) {
        birthday = newBirthday;
        return birthday;
    }

    public String changeAddress(String newAddress) {
        address = newAddress;
        return address;
    }

    public String changeNumber(String newNumber) {
        number = newNumber;
        return number;
    }
    //Extra Methods
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
    public String toString() {
        String returnString = "Name: " + getName() + "\nNumber: "  + getNumber() + "\nAddress: " + getAddress() + "\nBirthday: " + getBirthday();
        return returnString;
    }
    public void printInfo () {
        System.out.println(toString());
    }

    public void printInstructions() {
        System.out.println("Things you can do: (NOTE: Everything you type is case sensitive)");
        System.out.println("------View-Information------");
        System.out.println("Get your information: (Type \"get info\")");
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
