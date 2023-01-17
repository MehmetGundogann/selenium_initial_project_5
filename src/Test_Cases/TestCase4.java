package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.navigate().to("https://automationexercise.com/");


        WebElement footer = driver.findElement(By.cssSelector("div[class='footer-bottom'] p"));
        System.out.println(footer.getText().equals("Copyright © 2021 All rights reserved"));

        Driver.quitDriver();

    }
}
