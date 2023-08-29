package com.Selenium.SeleniumPractice;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main( String [] args ) throws Exception {
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.get("https://www.softwaretestingmaterial.com/");

		driver.manage().window().maximize(); // For maximizing the window
		
		
	//	Thread.sleep(3000);
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit wait

		
		//ABOVE METHOD FROM RELATIVE LOCATORS
//
//		By emailLocator=RelativeLocator.with(By.tagName("input")).above(By.id("pass"));
//		WebElement wb1=driver.findElement(emailLocator);
//		wb1.sendKeys("9922558576");
//		
//		Thread.sleep(2000);
//		
//		//BELOW METHOD FROM RELATIVE LOCATORS
//		
//		By passwordLocator=RelativeLocator.with(By.tagName("input")).below(By.id("email")); // Below Method- Access password by using email field
//		WebElement wb=driver.findElement(passwordLocator);
//		
//									// OR WE CAN USE FOLLOWING METHOD //
//		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));		    	//EXPLICITE WAIT
//		wb.sendKeys("shrinath");
		
	//	WebElement passwordEnter = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("email")));
		
		//toRightOf Method from relative locators
//     	By rightSidejare=RelativeLocator.with(By.tagName("img")).toRightOf(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[1]/div/figure/a/img"));
//		WebElement marClick=driver.findElement(rightSidejare);
//		marClick.click();
		
		//toRightOf Method from relative locators

//		WebElement leftSide=driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(By.xpath("//*[@id=\"kt-layout-id_0f4a12-68\"]/div/div[2]/div/figure/a/img")));
//		leftSide.click();
		
		
	//	Thread.sleep(3000);
		//driver.close();
        
     //   driver.findElement(By.cssSelector("a[class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
        

	
		
		
		
	}

}
