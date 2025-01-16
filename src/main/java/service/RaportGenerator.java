package service;

import model.Client;
import model.ExpenseCategory;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class RaportGenerator {
    private Map<ExpenseCategory, Double> categoryData;
    private List<Client> clients;

    public RaportGenerator(Map<ExpenseCategory, Double> categoryData, List<Client> clients) {
        if (categoryData == null || categoryData.isEmpty()) {
            throw new IllegalArgumentException("Expense category data is null or empty");
        }

        this.categoryData = categoryData;

        if (clients == null || clients.isEmpty()) {
            throw new IllegalArgumentException("Clients list is null or empty");
        }

        this.clients = clients;
    }

    public void generateCategoryReport(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            JSONObject json = new JSONObject(categoryData);
            writer.write(json.toString());
        } catch (IOException e) {
            System.out.println("Issue while writing category report to file");
            e.printStackTrace();
        }

    }

    public void generateHighSpendersReport(String filepath) {
        System.out.println(clients);
    }
}
