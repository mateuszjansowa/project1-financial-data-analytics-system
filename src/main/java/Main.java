import model.Client;
import model.ExpenseCategory;
import service.ExpenseProcessor;
import service.ReportGenerator;
import util.CsvReader;

import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String INPUT_FILE = Paths.get("src", "main", "resources", "input", "expenses.csv").toString();
    private static final String CATEGORY_OUTPUT = Paths.get("src", "main", "resources", "outpus", "categoryData.json").toString();
    private static final String HIGH_SPENDERS_OUTPUT = Paths.get("src", "main", "resources", "output", "highSpenders.txt").toString();

    public static void main(String[] args) {
        try {
            List<Client> clients = CsvReader.readCsv(INPUT_FILE);
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
            raportGenerator.generateCategoryReport(CATEGORY_OUTPUT);
            raportGenerator.generateHighSpendersReport(HIGH_SPENDERS_OUTPUT);
        } catch (Exception e) {
            System.out.println("Error while executing Main class: " + e.getMessage());
            e.printStackTrace();
        }
    }
}