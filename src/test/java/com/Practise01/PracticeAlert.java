package com.Practise01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeAlert {
    public static void main(String[] args) throws InterruptedException {
      //  alertwithok();
      //  alertcancel();
          alertsendkey();
    }

 /*   public static void alertwithok() throws InterruptedException {

        WebDriver driver= WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        Thread.sleep(3000);
    }*/

   /* public static void alertcancel() throws InterruptedException {
        WebDriver driver= WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        Alert alert= driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);
        WebElement element=driver.findElement(By.xpath("//p[text()='You clicked: Cancel']"));
       boolean visibleelement= element.isDisplayed();
       System.out.println(visibleelement);


    }*/

    public static void alertsendkey() throws InterruptedException {
        WebDriver driver= WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        Alert alert= driver.switchTo().alert();
        alert.sendKeys("Text is typing");
        Thread.sleep(3000);
        alert.accept();
        //alert.dismiss();
        Thread.sleep(3000);
        WebElement element=driver.findElement(By.xpath("//p[text()='You entered: test']"));
        boolean visibleelement1= element.isDisplayed();
        System.out.println(visibleelement1);


    }
}
