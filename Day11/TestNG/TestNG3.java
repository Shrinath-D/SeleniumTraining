package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG3 {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");	  
  }
  
  @Test
  public void f1() {
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
  @BeforeTest
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
  }

  @AfterTest
  public void afterMethod() {
	  System.out.println("Hello");
	  driver.quit();
  }
  

}
