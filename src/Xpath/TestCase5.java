package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase5 {

    public static void execute(WebDriver driver) {
        driver.get("http://localhost/wordpress/wp-admin/index.php");
        WebElement continueButton = driver.findElement(By.xpath("//span[normalize-space()='Dark']"));
        continueButton.click();
    }
}
