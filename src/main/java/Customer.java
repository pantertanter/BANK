import java.util.Objects;

public class Customer {

    private String name;

    private int Pin;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public int getPin() { return Pin; }

    public void setPin(int pin) { Pin = pin; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getName(), customer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
