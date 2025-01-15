package model;

public class Client {
    private final String firstName;
    private final String lastName;
    private final ExpenseCategory category;
    private final double amount;

    public Client(String firstName, String lastName, ExpenseCategory category, double amount) throws IllegalArgumentException {
        if (firstName == null || firstName.isEmpty() ||
                lastName == null || lastName.isEmpty() ||
                category == null || amount < 0) {
            throw new IllegalArgumentException("Invalid argument for creating Client");
        }

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
