public class Testing {
    public static void main(String [] args) {
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
        System.out.println(newNumber);
    }
}
