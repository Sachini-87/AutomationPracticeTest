package com.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetTextMthd {

    public static void main(String[] args) {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        //getText()
        String ElementText=driver.findElement(By.xpath("//a[@class='gb_Z']")).getText();
        System.out.println(ElementText);


        //getAttribute()
        String ElementAttributeText=driver.findElement(By.xpath(("//input[@name='btnK'])[2])"))).getAttribute("value");
        System.out.println(ElementAttributeText);

        driver.close();
    }
}
