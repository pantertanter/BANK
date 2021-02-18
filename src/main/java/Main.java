import db.DbAcces;

public class Main {

    public static void main(String[] args) {
        DbAcces acces = new DbAcces(true);
        //Customer c1 = new Customer("Jon");
        /*
        MultiUser multiuser = new MultiUser();
        Customer c1 = new Customer(multiuser.UserMenu());
        Account account = new Account(c1);

        int newBalance = account.depositAmount(125);
        System.out.println(String.format("Ny balance: %,d", newBalance));

        newBalance = account.depositAmount(325);
        System.out.println(String.format("Ny balance: %,d", newBalance));

        newBalance = account.depositAmount(2000000);
        System.out.println(String.format("Ny balance: %,d", newBalance));
        */
    }
}
