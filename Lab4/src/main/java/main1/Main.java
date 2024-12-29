package main1;

import package2.*;
import package3.*;

public class Main {
    public static void main(String[] args) {

        ReportFactory desktopFactory = new DesktopReportFactory();
        ReportFactory mobileFactory = new MobileReportFactory();
        ReportFactory webFactory = new WebReportFactory();

        ReportGenerator desktopReportGenerator = new ReportGenerator(desktopFactory);
        ReportGenerator mobileReportGenerator = new ReportGenerator(mobileFactory);
        ReportGenerator webReportGenerator = new ReportGenerator(webFactory);

        System.out.println("Generating Reports with Desktop Factory:");
        desktopReportGenerator.generateReports();

        System.out.println("\nGenerating Reports with Mobile Factory:");
        mobileReportGenerator.generateReports();

        System.out.println("\nGenerating Reports with Web Factory:");
        webReportGenerator.generateReports();
    }
}
