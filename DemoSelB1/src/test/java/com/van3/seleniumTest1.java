package com.van3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumTest1 {

    @Test
    public void selTest1() throws InterruptedException {
//        // setting system property of chromeDriver
//        System.setProperty("webDriver.chrome.driver", "F:\\video Training Selenium ITMSCoaching\\New folder\\DemoSelB1\\src\\test\\resources\\drivers\\chromedriver.exe");
//
//        //Init a new Chrome Driver object
//        WebDriver webDriver = new ChromeDriver();
//        // Launching a specified url
//        webDriver.get("https://translate.google.com/?hl=vi");
//        //
//        Thread.sleep(2000);
        // Set system property for chromedriver
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver2\\chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Find the search box element by name
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter a search query and submit
        searchBox.sendKeys("Selenium automation testing");
        searchBox.submit();

        // Wait for the results page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify that the results page title contains the search query
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Selenium automation testing")) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }

        // Close the browser
        driver.quit();


    }
}
