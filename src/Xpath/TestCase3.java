package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3 {

    public static void execute(WebDriver driver) {
        driver.get("http://localhost/wordpress/wp-admin/plugin-install.php");
        WebElement installSearchField = driver.findElement(By.xpath("//input[@id='search-plugins']"));
        installSearchField.sendKeys("WP Dark Mode");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement installButtonWPDarkMode = driver.findElement(By.xpath("//a[@aria-label='Install WP Dark Mode – WordPress Dark Mode Plugin for Improved Accessibility, Dark Theme, Night Mode, and Social Sharing 5.0.4 now']"));
        installButtonWPDarkMode.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement activateButtonWPDarkMode = driver.findElement(By.xpath("//a[contains(@aria-label, 'Activate WP Dark Mode')]"));
        activateButtonWPDarkMode.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        installSearchField.clear();
        installSearchField.sendKeys("Academy LMS");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement installButtonAcademyLMS = driver.findElement(By.xpath("//a[contains(@aria-label, 'Install') and contains(@aria-label, 'now')]"));
        installButtonAcademyLMS.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
