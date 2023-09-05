package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertExample {
	WebDriver driver ;
  @Test(priority = 2)
  public void f1() {
	  driver = new EdgeDriver();
	  WebDriverManager.edgedriver().setup();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();

	  
	  driver.findElement(By.name("q")).sendKeys("Hello",Keys.ENTER);
	  
	//  Assert.assertEquals(driver.getTitle(), "Hello - Google Search");
	    Assert.assertNotEquals(driver.getTitle(), "Helo - Google Searc");
  }
  @Test(priority = 1)
  public void f2()  {
	  driver = new EdgeDriver();
	  WebDriverManager.edgedriver().setup();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  
  }
  
  @Test 
 
  public void f3() {
	  driver = new EdgeDriver();
	  WebDriverManager.edgedriver().setup();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
  }
}
