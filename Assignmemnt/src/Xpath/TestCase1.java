package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {

    public static void execute(WebDriver driver) {
        driver.get("http://localhost/wordpress/wp-login.php?loggedout=true&wp_lang=en_US");
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='user_login']"));
        usernameField.sendKeys("root");
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='user_pass']"));
        passwordField.sendKeys("root");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='wp-submit']"));
        loginButton.click();
    }
}
