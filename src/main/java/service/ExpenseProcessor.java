package service;

import model.Client;
import model.ExpenseCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseProcessor {
    private final List<Client> clients;

    public ExpenseProcessor(List<Client> clients) {
        if (clients == null || clients.isEmpty()) {
            throw new IllegalArgumentException("Client list is empty or null");
        }

        if (clients.stream().anyMatch(client -> client == null)) {
            throw new IllegalArgumentException("Client list contains null elements");
        }

        this.clients = clients;
    }

    public Map<ExpenseCategory, Double> calculateExpenseByCategory() {
        Map<ExpenseCategory, Double> expenseByCategory = new HashMap<>();
        for (Client client : clients) {
            expenseByCategory.compute(
                    client.getCategory(),
                    (key, value) -> (value == null ? 0 : value) + client.getAmount()
            );
        }

        return expenseByCategory;
    }

    public List<Client> findHighSpenders(double threshold) {
        List<Client> highSpenders = new ArrayList<>();

        for (Client client : clients) {
            if (client.getAmount() >= threshold) {
                highSpenders.add(client);
            }
        }

        return highSpenders;
    }
}
