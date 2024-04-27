package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase2 {

    public static void execute(WebDriver driver) {
        // Navigate to the plugins page
        driver.get("http://localhost/wordpress/wp-admin/plugins.php");

        // Find the search field and input 'WP Dark Mode'
        WebElement pluginSearchField = driver.findElement(By.xpath("//input[@id='plugin-search-input']"));
        pluginSearchField.sendKeys("WP Dark Mode");

        // Wait for 3 seconds (optional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Press Enter or perform any action to initiate the search
        pluginSearchField.submit();
    }
}
