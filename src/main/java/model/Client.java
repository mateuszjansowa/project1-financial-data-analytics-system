package model;

public class Client {
    private final String firstName;
    private final String lastName;
    private final ExpenseCategory category;
    private final double amount;

    public Client() {
        this.firstName = "-";
        this.lastName = "-";
        this.category = null;
        this.amount = 0;
    }

    public Client(String firstName, String lastName, ExpenseCategory category, double amount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.category = category;
        this.amount = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ExpenseCategory getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", category=" + category +
                ", amount=" + amount +
                '}';
    }
}
