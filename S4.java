package Interviewqs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4 {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://localhost/login.do");
	WebElement UNTB = driver.findElement(By.name("username"));
	UNTB.sendKeys("admin");
	UNTB.sendKeys(Keys.CONTROL+"ac");
	WebElement PWTB = driver.findElement(By.name("pwd"));
	PWTB.sendKeys(Keys.CONTROL+"v");

	
	
	
	
	
}


}
