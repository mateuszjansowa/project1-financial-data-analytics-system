package util;

import model.Client;
import model.ExpenseCategory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static List<Client> readCsv(String filePath) {
        List<Client> clients = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    Client client = getClientFromLine(line);
                    clients.add(client);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error while buffering input csv file: " + e.getMessage());
        }

        return clients;
    }

    public static Client getClientFromLine(String line) {
        String[] fields = line.split(",");
        if (fields.length != 4) {
            throw new IllegalArgumentException("Invalid data format");
        }

        String firstName = fields[0];
        String lastName = fields[1];
        ExpenseCategory category = ExpenseCategory.valueOf(fields[2]);
        double amount = Double.parseDouble(fields[3]);

        return new Client(firstName, lastName, category, amount);
    }
}
