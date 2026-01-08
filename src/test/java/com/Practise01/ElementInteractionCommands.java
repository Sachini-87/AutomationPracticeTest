package com.Practise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementInteractionCommands {

    public static void main(String[] args) {
        WebDriver driver= WebDriverManager.chromedriver().create();
        driver.navigate().to("https://demo.phppointofsale.com/");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        List<WebElement>elements=driver.findElements(By.cssSelector("span[class='text']"));
        for(int i=0;i< elements.size();i++){

            System.out.println(elements.get(i).getText());

        }


    }
}
