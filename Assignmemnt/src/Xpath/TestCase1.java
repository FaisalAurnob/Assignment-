package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {

    public static void execute(WebDriver driver) {
        // Open WordPress login page
        driver.get("http://localhost/wordpress/wp-login.php?loggedout=true&wp_lang=en_US");

        // Find the username and password fields using XPath and input your credentials
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='user_login']"));
        usernameField.sendKeys("root");

        WebElement passwordField = driver.findElement(By.xpath("//input[@id='user_pass']"));
        passwordField.sendKeys("root");

        // Find and click on the login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='wp-submit']"));
        loginButton.click();
    }
}
