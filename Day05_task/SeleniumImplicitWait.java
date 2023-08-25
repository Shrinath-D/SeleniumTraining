package com.Selenium.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumImplicitWait {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdhondge\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
        ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\sdhondge\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

        // CHROME DRIVER OBJECT
        WebDriver driver= new ChromeDriver(co);

         
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
        
        //MAXIMIZE THE SCREEN
        driver.manage().window().maximize();
        Thread.sleep(4000);
        WebElement user = driver.findElement(By.name("username"));
        user.sendKeys("Admin",Keys.ENTER);
        user.click();
        
        WebElement pw = driver.findElement(By.name("password"));
        pw.sendKeys("admin123");
        pw.click();
        pw.sendKeys(Keys.ENTER);
       // Thread.sleep(3000);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit wait

       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
       
       Thread.sleep(4000);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));  //Implicit Wait

       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	}

}
