import model.Client;
import util.CsvReader;

import java.util.List;

public class Main {
    private static final String input = "D:\\coding\\Java\\FinancialDataAnalyticsSystem\\src\\main\\resources\\input\\expenses.csv";

    public static void main(String[] args) {
        try {
            List<Client> clients = CsvReader.readCsv(input);
            for (Client client : clients) {
                System.out.println(client);
            }

        } catch (Exception e) {
            System.out.println("Error while executing Main class: " + e.getMessage());
            e.printStackTrace();
        }
    }
}