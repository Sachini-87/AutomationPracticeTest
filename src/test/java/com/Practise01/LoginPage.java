package com.Practise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverManager.chromedriver().create();
        driver.navigate().to("https://automationexercise.com/");
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sachini");
        driver.findElement(By.xpath("(//form)[2]//input[@name='email']")).sendKeys("dushyanthisarah@gamail.com");
        driver.findElement(By.xpath("//button[text()='Signup']")).click();
        Thread.sleep(3000);
        driver.close();

    }
}
