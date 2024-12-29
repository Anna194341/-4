package package3;

import reports.*;
import package2.*;

public class ReportGenerator {
    public final ReportFactory reportFactory;

    public ReportGenerator(ReportFactory reportFactory) {
        this.reportFactory = reportFactory;
    }

    public void generateReports() {
        FinancialReport financialReport = reportFactory.createFinancialReport();
        MarketingReport marketingReport = reportFactory.createMarketingReport();
        HRReport hrReport = reportFactory.createHRReport();

        generateReport(financialReport);
        generateReport(marketingReport);
        generateReport(hrReport);
    }

    private void generateReport(Report report) {
        report.generate();
    }
}
