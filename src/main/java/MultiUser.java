import java.util.Locale;
import java.util.Scanner;

public class MultiUser {

    Customer customer = new Customer("");

    boolean running;

    public void MakePersonalUser() { // Method for creating a new user(hardcoded or user input?)
        System.out.println("Please input name");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        customer.setName(name);

        System.out.println("You entered " + name + " as your name"); // y/n function ?

        while (running = true) {
            System.out.println("Please input a four digit desired pin for " + name);
            // Maybe make random and print
            int Pin = input.nextInt();
            customer.setPin(Pin);
            if (customer.getPin() > 999 && customer.getPin() < 10000) {
                System.out.println("Your name is " + customer.getName() + " and your Pin is " + customer.getPin());
                break;
            } else {
                System.out.println("Wrong input error");
            }
        }
    }
}