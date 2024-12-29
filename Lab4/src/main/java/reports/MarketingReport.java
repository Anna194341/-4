package reports;

public class MarketingReport implements Report {
    @Override
    public String generate() {
        return "Marketing Report";
    }

    @Override
    public String getData() {
        return "Get marketing data";
    }
}