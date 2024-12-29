package package2;

import reports.*;


public interface ReportFactory {
    FinancialReport createFinancialReport();
    MarketingReport createMarketingReport();
    HRReport createHRReport();
}
