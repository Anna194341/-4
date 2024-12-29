package reports;

public class HRReport implements Report {
    @Override
    public String generate() {
        return "HR Report";
    }

    @Override
    public String getData() {
        return "Get HR data";
    }
}