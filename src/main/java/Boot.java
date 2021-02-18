import db.Database;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Boot {
    Database db = new Database();

    public void menuWriter() {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        int menuChoice;
        while (running) {
            System.out.println("Welcome to C4 BANK");
            System.out.println("Options:");
            System.out.println("Press [1] to log in as customer");
            System.out.println("Press [2] to log in as bank staff");
            System.out.println("Press [3] to create new customer log in");
            System.out.println("Press [4] to create new bank staff log in");
            System.out.println("Press [0] to reboot");
            menuChoice = input.nextInt();

            switch (menuChoice){
                case 1:
                    // log in c
                    break;
                case 2:
                    // log in staff
                    break;
                case 3:
                    createCustomer();
                    break;
                case 4:
                    createStaff();
                    break;
            }

        }

    }

    public void createCustomer() {
        db.connect();
        String sql = "INSERT into users(uid) values(?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, a);
        ps.setString(2, b);
        ps.executeUpdate();
    }

    public void createStaff() {

    }
}