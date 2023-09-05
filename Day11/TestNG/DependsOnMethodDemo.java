package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethodDemo {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new EdgeDriver();
	  WebDriverManager.edgedriver().setup();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
  }
  @Test (dependsOnMethods = {"f"})
  public void f2() {
	  driver.findElement(By.name("q")).sendKeys("Hello",Keys.ENTER);

  }
  @Test (dependsOnMethods = {"f","f2"})  
  public void f3() {
	  driver.quit();
  }
  @Test(groups = {"I am Number 1"})
  public void f4() {
	  
  }
}
