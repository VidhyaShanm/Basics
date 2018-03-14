package FirstTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class First_Test {
	public WebDriver drive();
  @Test
  public void main() {
	   	driver.findElement(By.id("identifierId")).sendKeys("svidhu1995@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("sbdv224vidhya");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content")).click();
		Thread.sleep(10000);
	   }
  @BeforeMethod
  public void beforeMethod() {
	    System.setProperty("webdriver.firefox.marionette","C:\\Users\\shanmvid\\Softwares\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
