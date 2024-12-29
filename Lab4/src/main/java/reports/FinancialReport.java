package reports;

public class FinancialReport implements Report {
    @Override
    public String generate() {
        return "Financial Report";
    }

    @Override
    public String getData() {
        return "Get financial data";
    }
}