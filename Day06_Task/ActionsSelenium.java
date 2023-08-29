package com.Selenium.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSelenium {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

		//driver.get("https://www.browserstack.com/");
        //driver.get("https://demoqa.com/droppable/");
        driver.get("https://www.google.co.in/");
        
		
//		
          Actions act = new Actions (driver);
//        WebElement hoverElement=driver.findElement(By.xpath("//*[@id=\"signupModalButton\"]"));
//        
//        //act.moveToElement(hoverElement).perform(); //moveToElement
//        
//        act.doubleClick(hoverElement).perform();     //doubleClick
          
          Thread.sleep(4000);
          
          JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
          
          // Scroll down the page using JavaScript
          // You can adjust the Y offset value based on your requirements
          jsExecutor.executeScript("window.scrollBy(0, 200);");

        
//        WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]")); //Source
//        WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]")); //Destination
//        act.clickAndHold(drag).release(drop).build().perform();
        
       // Thread.sleep(2000);
        WebElement caps=driver.findElement(By.id("APjFqb"));
        act.keyDown(Keys.SHIFT);
        act.sendKeys("hello").perform();
      


		
	}

}
