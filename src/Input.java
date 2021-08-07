import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Type Something: ");
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo() {
        System.out.println("Select (y/n):");
        String userAnswer = scanner.next();
        return userAnswer.equals("y");
    }

    public int getInt(int min, int max) {
        int userInt = scanner.nextInt();

        if (userInt < min || userInt > max) {
            System.out.println("That is not a valid choice! Try again!");
            return getInt(min, max);
        } else {
//            System.out.println("That's a valid integer.");
            return userInt;
        }
    }

    public int getInt() {
        System.out.println("Give me an integer: ");
        int userInt = scanner.nextInt();
        return userInt;
    }

    public double getDouble(double min, double max) {
        System.out.println("Give me an decimal: ");
        double userDouble = scanner.nextDouble();

        if (userDouble < min || userDouble > max) {
            System.out.println("Try again!");
            return getDouble(min, max);
        } else {
            System.out.println("That's a valid decimal.");
            return userDouble;
        }
    }

    public double getDouble() {
        System.out.println("Give me a decimal: ");
        double userDouble = scanner.nextDouble();
        return userDouble;
    }


}
