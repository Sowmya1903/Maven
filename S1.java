package Interviewqs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://localhost/login.do");
	
	WebElement USTB = driver.findElement(By.id("username"));
	USTB.sendKeys("admin");
	
	WebElement PWTB = driver.findElement(By.id("pwd"));
	PWTB.sendKeys("manager");
	
	WebElement LGBTN = driver.findElement(By.xpath("//div[text()='login'])"));
	LGBTN.click();
	

	Thread.sleep(2000);
String actualTl = driver.getTitle();
String hmepage="actiTIME - Enter Time-Track";
if(actualTl.equals(hmepage))
	System.out.println("Pass");
else
	System.out.println("Fail");
    Thread.sleep(2000);
WebElement LGUT = driver.findElement(By.linkText("Logout"));
LGUT.click(); 
}
}