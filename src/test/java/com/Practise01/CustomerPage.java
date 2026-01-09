package com.Practise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class CustomerPage {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver= WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.phppointofsale.com/");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        driver.findElement(By.xpath("//span[text()='Customers']")).click();
        driver.findElement(By.xpath("//a[@href='https://demo.phppointofsale.com/index.php/customers']")).click();
        driver.findElement(By.xpath("//a[@id='new-person-btn']")).click();
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Sachi");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Dush");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dushyanthisarah@gmail.com");
        driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("0710802392");
        //driver.findElement(By.xpath("//span[text()='Choose file']")).click();
        Thread.sleep(2000);
       // Runtime.getRuntime().exec("C:\\Users\\sampath\\Desktop\\Automate1.exe");
        driver.findElement(By.xpath("//input[@name='address_1']")).sendKeys("No 282,Matara");
        driver.findElement(By.xpath("//input[@name='address_2']")).sendKeys("Sri Lanka");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Homagama");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Test");
        Thread.sleep(2000);

    }
}
