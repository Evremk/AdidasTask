package com.adidas.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdidasBasicNavigation{

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/index.html");

        WebElement locatorLaptop = driver.findElement(By.xpath("//a[.='Laptops']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(locatorLaptop));

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        locatorLaptop.click();





        String title = driver.getTitle();

        System.out.println("title = " + title);

        Thread.sleep(3000);
        driver.close();




    }

}
