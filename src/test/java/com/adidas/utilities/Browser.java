package com.adidas.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static void main(String[] args) {


    }

    public void setChromeDriver

        {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }
}