import java.util.Scanner;
/*
public class MultiUser {

    Customer customer = new Customer("");

    boolean running;

    public String UserMenu() {

            System.out.println("User creation menu");
            System.out.println("Press 1 to create a customer login");
            System.out.println("Press 2 to create a admin/staff login");
            System.out.println("Press 3 to exit user creation menu");

            int choice;

            Scanner input = new Scanner(System.in);

            choice = input.nextInt();

                switch (choice) {
                    case 1:
                        CreatePersonalUser();
                        break;
                    case 2:
                        AdminStaff();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Choice must be a value between 1 and 3.");
                }
        return customer.getName();
    }

    public String CreatePersonalUser() throws ArithmeticException { // Method for creating a new user(hardcoded or user input?)
        System.out.println("Input username");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        customer.setName(name);

        System.out.println("You entered " + customer.getName() + " as username"); // y/n function ?

        //while (running = true) {
            System.out.println("Input a four digit pin for " + name);
            // Maybe make random and print
            int Pin = input.nextInt();
            customer.setPin(Pin);
            if (customer.getPin() > 999 && customer.getPin() < 10000) {
                System.out.println("Username " + customer.getName() + " Pin " + customer.getPin());
                //break;
            } else {
                //throw new ArithmeticException("Invalid input error");
                System.out.println("Invalid input error");
            }
        //}
        return customer.getName();

    }

    public String AdminStaff() {
        System.out.println("Input username");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        customer.setName(name);

        System.out.println("You entered " + customer.getName() + " as username"); // y/n function ?
        System.out.println("You are staff/admin in the system");

        return customer.getName();
    }
}*/