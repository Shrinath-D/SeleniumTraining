package com.Selenium.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertSelenium {


		    public static void main(String[] args) {

		        // TODO Auto-generated method stub

		        WebDriverManager.chromedriver().setup();

		        //Creating Object of chrommeDriver

		        WebDriver driver=new ChromeDriver();

		        //opening the URLhttps://demo.guru99.com/

		        driver.get("https://demo.guru99.com/test/delete_customer.php");


		        //maximizing the window
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        

		        WebElement sourceElement=driver.findElement(By.name("cusid"));
		        sourceElement.sendKeys("abc@123.com");

		        WebElement submit=driver.findElement(By.name("submit"));
		        submit.click();

		        

		        Alert al=driver.switchTo().alert();
		        al.accept();

		        

		        Alert al2=driver.switchTo().alert();
		        String aMsg=al2.getText();

		        al2.accept();
		        System.out.println(aMsg);
		    }
	}
