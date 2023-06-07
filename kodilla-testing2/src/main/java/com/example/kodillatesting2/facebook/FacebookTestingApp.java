package com.example.kodillatesting2.facebook;

import com.example.kodillatesting2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//div[contains(@class, \"_al64\")]/button[2]";
    public static final String XPATH_REGISTER = "//div[contains(@class, \"_6ltg\")]/a[@role='button']";
    public static final String XPATH_REGISTER_DRAWER = "//div[contains(@class, \"_8ien\")]";
    public static final String XPATH_BIRTH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_BIRTH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_BIRTH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {


        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_COOKIES));
        acceptCookies.click();

        WebElement register = driver.findElement(By.xpath(XPATH_REGISTER));
        register.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_REGISTER_DRAWER)));

        WebElement birthDay = driver.findElement(By.xpath(XPATH_BIRTH_DAY));
        Select selectDay = new Select(birthDay);
        selectDay.selectByValue("26");

        WebElement birthMonth = driver.findElement(By.xpath(XPATH_BIRTH_MONTH));
        Select selectMonth = new Select(birthMonth);
        selectMonth.selectByValue("2");

        WebElement birthYear = driver.findElement(By.xpath(XPATH_BIRTH_YEAR));
        Select selectYear = new Select(birthYear);
        selectYear.selectByValue("1999");
    }
}
