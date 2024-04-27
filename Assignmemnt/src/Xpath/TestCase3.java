package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3 {

    public static void execute(WebDriver driver) {
        // Navigate to the plugin installation page
        driver.get("http://localhost/wordpress/wp-admin/plugin-install.php");

        // Find the search field and input 'WP Dark Mode'
        WebElement installSearchField = driver.findElement(By.xpath("//input[@id='search-plugins']"));
        installSearchField.sendKeys("WP Dark Mode");

        // Wait for 3 seconds (optional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on the install button for WP Dark Mode
        WebElement installButtonWPDarkMode = driver.findElement(By.xpath("//a[@aria-label='Install WP Dark Mode – WordPress Dark Mode Plugin for Improved Accessibility, Dark Theme, Night Mode, and Social Sharing 5.0.4 now']"));
        installButtonWPDarkMode.click();

        // Wait for 10 seconds (optional)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Activate WP Dark Mode
        WebElement activateButtonWPDarkMode = driver.findElement(By.xpath("//a[contains(@aria-label, 'Activate WP Dark Mode')]"));
        activateButtonWPDarkMode.click();

        // Wait for 3 seconds (optional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Clear search field
        installSearchField.clear();

        // Input 'Academy LMS' into the search field
        installSearchField.sendKeys("Academy LMS");

        // Wait for 3 seconds (optional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on the install button for Academy LMS
        WebElement installButtonAcademyLMS = driver.findElement(By.xpath("//a[contains(@aria-label, 'Install') and contains(@aria-label, 'now')]"));
        installButtonAcademyLMS.click();

        // Wait for 10 seconds (optional)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
