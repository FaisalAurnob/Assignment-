package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase5 {

    public static void execute(WebDriver driver) {
        // Navigate to the specific URL
        driver.get("http://localhost/wordpress/wp-admin/index.php");

        // Click the specified element
        WebElement continueButton = driver.findElement(By.xpath("//span[normalize-space()='Dark']"));
        continueButton.click();
    }
}
