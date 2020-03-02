package Interviewqs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3 {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		
		
		
//Without using clear() method
		
		WebElement unTB = driver.findElement(By.name("username"));
		unTB.sendKeys("admin");
		unTB.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
	}
	
	
}
