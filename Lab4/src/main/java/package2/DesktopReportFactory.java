package package2;

import reports.*;

public class DesktopReportFactory implements ReportFactory{
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
