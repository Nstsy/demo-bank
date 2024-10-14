import static java.lang.System.out;

public class Account {
    String name;
    String address;
    double balance;

    public void display() {
        out.print(name);
        out.print(" (");
        out.print(address);
        out.print(") имеет на счету $");
        out.print(balance);
    }

    public double getInternet(double parcentageRate) {
        return balance * parcentageRate / 100.00;
    }
}
