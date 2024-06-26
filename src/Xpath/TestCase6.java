package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase6 {

    public static void execute(WebDriver driver) {
        driver.get("http://localhost/wordpress/wp-admin/index.php");
        WebElement darkModePlugin = driver.findElement(By.xpath("//div[normalize-space()='WP Dark Mode']"));
        darkModePlugin.click();
        WebElement customizationLink = driver.findElement(By.xpath("//h4[normalize-space()='Customization']"));
        customizationLink.click();
        WebElement switchOption = driver.findElement(By.xpath("//a[normalize-space()='Switch Settings']"));
        switchOption.click();
        WebElement option = driver.findElement(By.xpath("//div[@class='_selected bg-[#F9FAFB] flex flex-col items-center justify-center transition duration-75 rounded-lg relative cursor-pointer w-36 h-36']"));
        option.click();
        WebElement saveButton = driver.findElement(By.xpath("//button[@class='disabled:opacity-50 disabled:cursor-not-allowed inline-flex items-center gap-2 px-4 py-2 text-sm font-medium rounded-md cursor-pointer outline-none focus:outline-none hover:opacity-90 transition duration-75 bg-blue-500 text-white border border-blue-500']"));
        saveButton.click();
    }
}
