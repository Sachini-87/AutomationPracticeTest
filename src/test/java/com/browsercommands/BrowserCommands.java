package com.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserCommands {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();

        //driver.get("")
        driver.get("https://www.google.com");
        //driver.getCurrentUrl()
        String curentURL=driver.getCurrentUrl();
        System.out.println("Current URL is:"+curentURL);
        //driver .getTtile
        String Title=driver.getTitle();
        System.out.println("Title is:"+Title);
        driver.close();
    }
}
