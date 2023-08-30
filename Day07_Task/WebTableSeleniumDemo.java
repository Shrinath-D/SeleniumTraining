package com.Selenium.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableSeleniumDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trends.builtwith.com/websitelist/Responsive-Tables/Canada");
		//driver.het("https://trends.builtwith.com/websitelist/Responsive-Tables");
		driver.manage().window().maximize();
		
		
     	Thread.sleep(2000);
//     	
//     	WebElement wb=driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr[1]"));
//     	System.out.println(wb.getText());
//     	
//     	WebElement wb2=driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr[2]"));
//     	System.out.println(wb2.getText());
//     	
//     	List <WebElement> table = driver.findElements(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody"));
//     	for (WebElement w : table) {
//     		System.out.println(w.getText());
//     	}
//	
//     	WebElement a = driver.findElement(By.xpath("By.xpath(\"//table[@class='table table-responsive-sm table-sm mt-2 table-hover']//tr[1]"));
//     	System.out.println(a.getText());
//     	
     	List<WebElement> li=driver.findElements(By.xpath("//table[@class='table table-responsive-sm table-sm mt-2 table-hover']//tr"));
     	
     	for (int j = 0; j < li.size(); j++) {
     		System.out.println(j);
			WebElement element=driver.findElement(By.xpath("//table[@class='table table-responsive-sm table-sm mt-2 table-hover']//tr["+(j+1)+"]//td[2]"));
			System.out.println(element.getText());
			
     	}
	}
}
