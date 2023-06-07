package com.example.kodillatesting2.ebay;

import com.example.kodillatesting2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String SEARCHFIELD = "_nkw";                       // [1]

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME); // [2]
        driver.get("https://www.ebay.com");                                 // [3]

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Laptop");// [5]
        searchField.submit();


    }
}
