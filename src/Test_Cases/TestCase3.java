package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase3 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.navigate().to("https://automationexercise.com/");


        WebElement subscriptionHeader = driver.findElement(By.cssSelector("#footer h2"));
        System.out.println(subscriptionHeader.getText().equals("SUBSCRIPTION"));



        Driver.quitDriver();



         }

    }

