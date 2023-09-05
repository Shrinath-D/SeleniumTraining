package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG1 {
	 WebDriver driver;
  @Test
  public void f() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
  }
     @Test
   public void f1() {
	   WebDriverManager.chromedriver().setup();
	   driver.get("https://www.facebook.com/");
   }
}
