package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase2 {

    public static void execute(WebDriver driver) {
        driver.get("http://localhost/wordpress/wp-admin/plugins.php");
        WebElement pluginSearchField = driver.findElement(By.xpath("//input[@id='plugin-search-input']"));
        pluginSearchField.sendKeys("WP Dark Mode");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pluginSearchField.submit();
    }
}
