import model.Client;
import model.ExpenseCategory;
import service.ExpenseProcessor;
import service.ReportGenerator;
import util.CsvReader;

import java.util.List;
import java.util.Map;

public class Main {
    private static final String input = "D:\\coding\\Java\\FinancialDataAnalyticsSystem\\src\\main\\resources\\input\\expenses.csv";

    public static void main(String[] args) {
        try {
            List<Client> clients = CsvReader.readCsv(input);
            ExpenseProcessor expenseProcessor = new ExpenseProcessor(clients);

            for (Client client : clients) {
                System.out.println(client);
            }

            Map<ExpenseCategory, Double> categoryData = expenseProcessor.calculateExpenseByCategory();
            System.out.println(categoryData);

            List<Client> highSpenders = expenseProcessor.findHighSpenders(200);
            for (Client highSpender : highSpenders) {
                System.out.println("HighSpender: " + highSpender);
            }

            ReportGenerator raportGenerator = new ReportGenerator(categoryData, clients);
            raportGenerator.generateCategoryReport("D:\\coding\\Java\\FinancialDataAnalyticsSystem\\src\\main\\resources\\output\\categoryData.json");
            raportGenerator.generateHighSpendersReport("D:\\coding\\Java\\FinancialDataAnalyticsSystem\\src\\main\\resources\\output\\highSpenders.txt");
        } catch (Exception e) {
            System.out.println("Error while executing Main class: " + e.getMessage());
            e.printStackTrace();
        }
    }
}