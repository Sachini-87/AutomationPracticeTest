package com.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class NavigationCommands {
    public static void main(String[] args) {
        WebDriver driver= WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();
        driver.navigate().to("https://google.com");
    }
}
