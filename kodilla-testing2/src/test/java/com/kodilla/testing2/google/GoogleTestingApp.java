package com.kodilla.testing2.google;

public class GoogleTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Firefox\\geckodriver.exe");    // [1]
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");    // [2]
    }

}