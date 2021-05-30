package test;

import model.DataCalculator;
import page.CalculatorPage;
import page.CloudGoogleHomePage;
import page.TenMinuteMailPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.DataCalculatorCreator;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

import static service.DataCalculatorCreator.getCalculatorParameters;

public class CalculatorTest extends AbstractTest {

    @Test()
    public void setDataOnPage() throws IOException, UnsupportedFlavorException {

        DataCalculator parameters = getCalculatorParameters();
        String textForSearchCalculator = "Google Cloud Platform Pricing Calculator";

        CalculatorPage pageHome = new CloudGoogleHomePage(driver)
                .openPage()
                .getSearchResults(textForSearchCalculator)
                .getPage()
                .goToCalculatorFrame()
                .activateComputeEngine()
                .fillInstances(parameters.getNumberInstancesInput())
                .chooseInstancesFor(parameters.getWhatInstancesForInput())
                .chooseOperatingSystemOrSoftware(parameters.getOperatingSystemInput())
                .chooseMachineClass(parameters.getMachineClassInput())
                .chooseSeries(parameters.getSeriesInput())
                .chooseMachineType(parameters.getMachineTypeInput())
                .fillAllFieldsGPUs(parameters.getNumberGPUsInput(), parameters.getTypeGPUsInput())
                .chooseLocalSSD(parameters.getLocalSsdInput())
                .chooseDatacenterLocation(parameters.getDatacenterLocationInput())
                .chooseCommitedUsage(parameters.getCommitedUsageInput())
                .clickButtonAddToEstimate();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(pageHome.getVMClassResult(), parameters.getMachineClassExpected());
        softAssert.assertEquals(pageHome.getInstanceType(), parameters.getMachineTypeExpected());
        softAssert.assertEquals(pageHome.getRegion(), parameters.getDatacenterLocationExpected());
        softAssert.assertEquals(pageHome.getLocalSSD(), parameters.getLocalSsdExpected());
        softAssert.assertEquals(pageHome.getCommitmentTerm(), parameters.getCommitedUsageExpected());
        softAssert.assertEquals(pageHome.getTotalCost(), parameters.getTotalCostExpected());
        softAssert.assertAll();

        String sumOnlyFromTotalCost = pageHome.getSumOnlyFromTotalCost();

        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        TenMinuteMailPage tenMinuteMailPage = new TenMinuteMailPage(driver);
        tenMinuteMailPage.openPage()
                .saveEmailInBuffer();

        String emailFromBuffer = tenMinuteMailPage.getRandomEmail();

        driver.switchTo().window(tabs.get(0));

        pageHome.goToCalculatorFrame()
                .sendEmail(emailFromBuffer);

        driver.switchTo().window(tabs.get(1));

        tenMinuteMailPage.openLetter();

        String totalCostFromLetter = tenMinuteMailPage.getTotalSumFromLetter();

        softAssert.assertEquals(sumOnlyFromTotalCost, totalCostFromLetter);
    }
}