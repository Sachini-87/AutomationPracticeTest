package com.firstautomation;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;


public class PhpPosTest {
    public static void main(String [] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://demo.phppointofsale.com/index.php/login");
        driver.navigate().to("https://demo.phppointofsale.com/index.php/login");
        Thread.sleep(3000);
       WebElement elementusername= driver.findElement(By.xpath("//input[@name='username']"));
       elementusername.clear();
       elementusername.sendKeys("admin");
       WebElement elementpassword= driver.findElement(By.xpath("//input[@name='password']"));

       elementpassword.clear();
       elementpassword.sendKeys("pointofsale");
       WebElement elementbutton= driver.findElement(By.xpath("//button[@type='submit']"));

        elementbutton.click();

        //driver.quit();
    }
}
