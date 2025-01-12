# Financial Data Analytics System

## Overview

The **Financial Data Analytics System** is a console-based Java application that allows users to manage their personal expenses efficiently. By utilizing advanced Java features like Streams, Collections, and Generics, this project demonstrates modern Java programming practices while providing a practical and functional tool.

## Features

- Import expenses from a CSV file.
- View categorized expenses (e.g., Food, Transportation, Entertainment).
- Add new expenses directly in the application.
- Filter and analyze expenses by date, category, or amount.
- Generate summary reports in JSON and TXT formats.

## Objectives

1. **Practice Core Java Concepts**:
    - Strumienie (Streams)
    - Kolekcje (Collections)
    - Generics

2. **Showcase Java Proficiency**:
    - Writing clean and maintainable code.
    - Utilizing advanced features like Streams and lambda expressions.
    - Working with file I/O for importing/exporting data.

## Project Structure

```plaintext
ExpenseTracker/
├── src/
│   ├── main/
│   │   ├── model/
│   │   │   ├── Expense.java
│   │   │   └── Category.java
│   │   ├── service/
│   │   │   ├── ExpenseService.java
│   │   │   └── ReportService.java
│   │   └── App.java
│   └── test/
│       ├── ExpenseServiceTest.java
│       └── ReportServiceTest.java
├── resources/
│   ├── expenses.csv
├── README.md
├── build.gradle
└── .gitignore
```

## Key Classes

- **`Expense`**: Represents an individual expense with attributes like:
    - `date` (e.g., `2024-01-01`)
    - `category` (e.g., `Food`, `Transportation`)
    - `amount` (e.g., `50.5`)
    - `description` (e.g., `Lunch at a restaurant`).

- **`Category`**: Enum representing expense categories, such as:
    - `FOOD`
    - `TRANSPORTATION`
    - `ENTERTAINMENT`
    - And more, as needed.

- **`ExpenseService`**:
    - Handles core operations such as:
        - Importing and parsing CSV files.
        - Adding, removing, and updating expenses.
        - Filtering and analyzing expenses using Streams.

- **`ReportService`**:
    - Generates and exports reports based on user preferences:
        - **JSON**: Structured data format for easy sharing.
        - **TXT**: Human-readable summary.

- **`App`**:
    - The entry point of the application.
    - Coordinates between the services and manages user interaction.
    - Provides a menu-driven console interface for:
        - Importing expenses.
        - Viewing expenses.
        - Generating reports.

## Example Workflow

1. Start the application.
2. Import expenses from a CSV file (default: `resources/expenses.csv`).
3. Perform various actions:
    - Add new expenses.
    - View and filter expenses by date, category, or amount.
    - Generate and export reports in JSON or TXT format.
4. Exit the application after saving changes.

## Requirements

- **Java Version**: 17 or higher.
- **Build Tool**: Gradle.

## How to Run

1. Clone the repository: `git clone https://github.com/username/ExpenseTracker.git`

2. Navigate to the project directory: `cd ExpenseTracker`

3. Build the project: `gradle build`

4. Run: `gradle run`

## Sample data

```csv
date,category,amount,description
2024-01-01,Food,50.5,Lunch at a restaurant
2024-01-02,Transportation,15.0,Bus ticket
2024-01-03,Entertainment,30.0,Movie ticket
```