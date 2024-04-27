package Xpath;

import org.openqa.selenium.WebDriver;
import Browser.Chrome;

public class TestCaseExecute {

    public static void main(String[] args) {
        // Initialize WebDriver using Chrome class from Browser package
        WebDriver driver = Chrome.initializeDriver();

        try {
            // Execute test case 1
            TestCase1.execute(driver);

            // Execute test case 2
            TestCase2.execute(driver);

            // Execute test case 3
            try {
                TestCase3.execute(driver);
            } catch (Exception e) {
                System.out.println("Test case 3 failed.");
            }

        } finally {
            // Execute test case 5 regardless of the outcome of test case 3
            TestCase5.execute(driver);
            TestCase6.execute(driver);

            // Close the browser
            driver.quit();
        }
    }
}
