package com.Selenium.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatesSelenium {

	public static void main(String[] args) throws Exception {
			
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		
		driver.manage().window().maximize();
		
				
		  
		  Thread.sleep(5000);
		  
		 WebElement from=driver.findElement(By.xpath("//*[@id=\"source\"]"));
		 from.sendKeys("Pune");
		 from.click();
		 
		 
		  
		  Thread.sleep(2000);
		  
		WebElement to =  driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		to.sendKeys("Mumbai");
		to.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement datepick = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		  js.executeScript("arguments[0].setAttribute('value','04/10/2023')",datepick);
			Thread.sleep(2000);

		 driver.findElement(By.xpath("//*[@id=\"frmFinal\"]/div/div[5]/a")).click();
	}
}
