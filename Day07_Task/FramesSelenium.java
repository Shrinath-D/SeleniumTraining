package com.Selenium.SeleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesSelenium {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.opencart.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[6]/a")).click();
		
		//Select object for sortby dropdown
		
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		
		  // Get all options from the dropdown
        List<WebElement> options = s.getOptions();

        // Create a list to store option text
        List <String> optionTexts = new ArrayList<>();

        // Store option text in the list
        for (WebElement w : options) {
            optionTexts.add(w.getText());
        }

        // Sort the option text in ascending order
        Collections.sort(optionTexts);

        // Print the sorted option text
        for (String text : optionTexts) {
            System.out.println(text);
          
            }
//        s.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=pd.name&order=ASC");
//        for (String st : optionTexts) {
//            System.out.println(st);
//        }
//        
        // SELECT CLASS METHODS USE TO SELECT OPTIONS FROM DROP-DOWN LIST
        
        
      //  s.selectByIndex(2);
        Thread.sleep(2000);
       //s.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=pd.name&order=DESC");       
//        
//        if (s.isMultiple()) {
//        	System.out.println("It contains multiple options");
//        }
        
        
        
//        Thread.sleep(4000);
//        driver.quit();
    }

}
