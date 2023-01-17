package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase1 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.navigate().to("https://automationexercise.com/");

        WebElement logoValidation = driver.findElement(By.cssSelector("img[src='/static/images/home/logo.png']"));
        System.out.println(logoValidation.isDisplayed());
    }
}
