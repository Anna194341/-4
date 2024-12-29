package package2;

import reports.FinancialReport;
import reports.HRReport;
import reports.MarketingReport;

public class WebReportFactory implements ReportFactory {
    public FinancialReport createFinancialReport() {
        return new FinancialReport();
    }
    public MarketingReport createMarketingReport() {
        return new MarketingReport();
    }
    public HRReport createHRReport() {
        return new HRReport();
    }
}