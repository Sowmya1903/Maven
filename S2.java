package Interviewqs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2 {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	WebElement us = driver.findElement(By.name("username"));
	us.clear();
	
	
	
	
	
	
}
}
