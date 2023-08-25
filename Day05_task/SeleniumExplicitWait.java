package com.Selenium.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExplicitWait {

	public static void main( String [] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sdhondge\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
        ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\sdhondge\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

        // CHROME DRIVER OBJECT
        WebDriver driver= new ChromeDriver(co);
        long startTime = System.currentTimeMillis();

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
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin",Keys.ENTER);
        Thread.sleep(2000);
        
        
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); //Explicit Wait  
        WebElement webele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(webele));
        webele.click();

        // driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();//search button xpath
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
               
        long finishtime = System.currentTimeMillis();
        System.out.println(((finishtime - startTime) / 1000.0) + " Seconds...");

       // Thread.sleep(5000);
        driver.quit();
       

	}

}
