# Financial Data Analytics System

## Overview
The **Financial Data Analytics System** is a Java-based project that reads financial transactions from a CSV file, processes the data, and generates reports summarizing expenditures by category and identifying high spenders.

## Features
- **CSV File Processing**: Reads structured financial data.
- **Expense Analysis**: Categorizes expenses and sums them per category.
- **High Spenders Detection**: Identifies clients with expenditures above a threshold.
- **Report Generation**: Outputs data in JSON and TXT formats.
- **Exception Handling**: Ensures robust error handling for file operations and data validation.

## Project Structure
```plaintext
project-root/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── model/
│   │   │   │   ├── Client.java            // Represents a client.
│   │   │   │   ├── ExpenseCategory.java   // Enum for expense categories.
│   │   │   ├── service/
│   │   │   │   ├── ExpenseProcessor.java  // Processes and categorizes expenses.
│   │   │   │   ├── ReportGenerator.java   // Generates reports in JSON and TXT.
│   │   │   ├── util/
│   │   │   │   ├── CsvReader.java         // Reads financial data from CSV.
│   │   │   ├── Main.java                  // Entry point of the application.
│   │   ├── resources/
│   │   │   ├── input/
│   │   │   │   ├── expenses.csv           // Input data file.
│   │   │   ├── output/
│   │   │       ├── categoryData.json      // JSON report of expenses by category.
│   │   │       ├── highSpenders.txt       // TXT report of high spenders.
```

## Installation & Usage
### Prerequisites
- Java 17+
- Gradle

### Build & Run
```bash
# Clone the repository
git clone <repository_url>
cd FinancialDataAnalyticsSystem

# Build the project
gradle build

# Run the application
java -jar build/libs/FinancialDataAnalyticsSystem.jar
```

## Example Data (CSV Format)
```
John,Doe,FOOD,150.75
Jane,Smith,TRANSPORT,75.50
Alice,Johnson,ENTERTAINMENT,220.00
```

## Output Files
- **categoryData.json**: Contains total expenses grouped by category.
- **highSpenders.txt**: Lists clients who spent more than a defined threshold.

## Future Enhancements
- Unit tests using JUnit.
- Configuration file for dynamic threshold values.
- Enhanced logging with SLF4J.

## License
This project is licensed under the MIT License.

