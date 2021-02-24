package GITHUB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	
	public static WebDriver driver;
	@BeforeSuite
	public void setUp(){
		WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	 
	  
	}
	@Test
	public void doLogin(){
		driver.get("https://gmail.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("buddy150515@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver,10); 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	driver.findElement(By.name("password")).sendKeys("Buddy150515");
	}	
	
	@AfterSuite
	public void userReg(){
		driver.quit();
	}

}
