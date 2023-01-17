package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.navigate().to("https://automationexercise.com/");

        try {

            List<WebElement> headerList = driver.findElements(By.cssSelector("ul[class='nav navbar-nav'] a"));

            ArrayList<String> headerTest = new ArrayList<>(
                    Arrays.asList("Home", "Products", "Cart", "Signup / Login", "Test Cases", "API Testing", "Video Tutorials", "Contact us")
            );
            for (int i = 0; i < headerList.size(); i++) {
                WebElement header = headerList.get(i);
                System.out.println(header.getText().contains(headerTest.get(i)));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            Driver.quitDriver();
        }
    }
}


