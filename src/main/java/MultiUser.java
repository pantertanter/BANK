import java.util.ArrayList;
import java.util.Scanner;

public class MultiUser {

    Customer customer = new Customer("", 0, "0000");
    Staff staff = new Staff("", 0, "");

    ArrayList<Staff> adminStaffArray;
    ArrayList<Customer> customersArray;

    Boolean running;

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
                        System.out.println("Choice must be a value between 1 and 3 included.");
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
            String Pin = input.nextLine();
            customer.setPin(Pin);
            if (customer.getPin().length() == 3) {
                System.out.println("Username " + customer.getName() + " Pin " + customer.getPin());
                //break;
                customersArray.add(new Customer(customer.getName(), customersArray.size() + 1, customer.getPin()));
            } else {
                //throw new ArithmeticException("Invalid input error");
                System.out.println("Invalid input error");
            }
        return customer.getName();
    }

    public String AdminStaff() {
        System.out.println("Input username");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        staff.setName(name);

        System.out.println("Input a four digit pin for " + staff.getName());
        // Maybe make random and print
        String Pin = input.nextLine();
        staff.setPin(Pin);
        if (customer.getPin().length() == 3) {
            System.out.println("Username " + staff.getName() + " Pin " + staff.getPin());
            //break;
        } else {
            //throw new ArithmeticException("Invalid input error");
            System.out.println("Invalid input error");
        }

        adminStaffArray.add(new Staff(staff.getName(), adminStaffArray.size() + 1, staff.getPin()));

        System.out.println("Username " + staff.getName() + " Pin " + staff.getPin()); // y/n function ?
        System.out.println("You are staff/admin in the system");

        return customer.getName();
    }
}