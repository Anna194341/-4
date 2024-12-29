package generatorTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import reports.*;

public class ReportGeneratorTest {
//перевірка методу generator()
    @Test
    public void testGenerateFinancialReport() {
        FinancialReport financialReport = new FinancialReport();
        String result = financialReport.generate();
        assertEquals("Financial Report", result);
    }

    @Test
    public void testGenerateMarketingReport() {
        MarketingReport marketingReport = new MarketingReport();
        String result = marketingReport.generate();
        assertEquals("Marketing Report", result);
    }

    @Test
    public void testGenerateHRReport() {
        HRReport hrReport = new HRReport();
        String result = hrReport.generate();
        assertEquals("HR Report", result);
    }
// Тести для методу getData()

    @Test
    public void testGetDataFinancialReport() {
        // Arrange
        FinancialReport financialReport = new FinancialReport();

        // Act
        String result = financialReport.getData();

        // Assert
        assertEquals("Get financial data", result);
    }

    @Test
    public void testGetDataMarketingReport() {
        // Arrange
        MarketingReport marketingReport = new MarketingReport();

        // Act
        String result = marketingReport.getData();

        // Assert
        assertEquals("Get marketing data", result);
    }

    @Test
    public void testGetDataHRReport() {
        // Arrange
        HRReport hrReport = new HRReport();

        // Act
        String result = hrReport.getData();

        // Assert
        assertEquals("Get HR data", result);
    }
}

