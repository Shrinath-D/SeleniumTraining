package com.Selenium.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingFrameSelenium {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
				
//		driver.switchTo().frame(0);
//		driver.switchTo().frame(3);
		
		//Switching to window
		
		WebElement findId=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(findId);
		
		
	
		WebElement findId2=driver.findElement(By.id("sampleHeading"));
		String s=findId2.getText();
		
		
		driver.switchTo().defaultContent();
		
		
		System.out.println("Programme Ok "+s);
		
//		Thread.sleep(3000);
//		driver.quit();
	}

}
