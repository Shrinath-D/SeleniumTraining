package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG4 {
	
	WebDriver driver ;
	
  @Test
  public void f() {
	  
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	  
  }
  
  public void f1() {
	  driver.get("https://www.facebook.com/");
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  System.out.println("this is beforeClass method");
  }
 
  @AfterClass
  public void afterClass() {
	  System.out.println("This is afterClass method");
	  driver.quit();
  }

}
