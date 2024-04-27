package Xpath;

import org.openqa.selenium.WebDriver;
import Browser.Chrome;

public class TestCaseExecute {

    public static void main(String[] args) {
        WebDriver driver = Chrome.initializeDriver();

        try {
            TestCase1.execute(driver);
            TestCase2.execute(driver);
            try {
                TestCase3.execute(driver);
            } catch (Exception e) {
                System.out.println("Test case 3 failed.");
            }

        } finally {
            TestCase5.execute(driver);
            TestCase6.execute(driver);
            driver.quit();
        }
    }
}
