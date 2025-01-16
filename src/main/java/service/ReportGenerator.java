package service;

import model.Client;
import model.ExpenseCategory;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ReportGenerator {
    private Map<ExpenseCategory, Double> categoryData;
    private List<Client> clients;

    public ReportGenerator(Map<ExpenseCategory, Double> categoryData, List<Client> clients) {
        if (categoryData == null || categoryData.isEmpty()) {
            throw new IllegalArgumentException("Expense category data is null or empty");
        }

        this.categoryData = categoryData;

        if (clients == null || clients.isEmpty()) {
            throw new IllegalArgumentException("Clients list is null or empty");
        }

        this.clients = clients;
    }

    private void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Issue while writing to file: " + filePath);
            e.printStackTrace();
        }
    }

    public void generateCategoryReport(String filePath) {
        JSONObject json = new JSONObject(categoryData);
        writeToFile(filePath, json.toString(4));
    }

    public void generateHighSpendersReport(String filePath) {
        StringBuilder report = new StringBuilder();

        for (Client client : clients) {
            report.append(client.toString()).append("\n");
        }

        writeToFile(filePath, report.toString());
    }
}
