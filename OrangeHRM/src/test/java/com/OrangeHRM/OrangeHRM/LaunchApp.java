package com.OrangeHRM.OrangeHRM;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchApp {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Java\\Selenium_Java_Project\\driverFiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MINUTES);
		driver.get("http://127.0.0.1/orangehrm-4.3.4/symfony/web/index.php/auth/login");
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("Smaran3005@");
driver.findElement(By.id("btnLogin")).click();
String welcome_text=driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]")).getText();
	System.out.println(welcome_text);
	
	Thread.sleep(2000);
	WebElement link=driver.findElement(By.id("welcome"));
	link.click();
	Thread.sleep(2000);
	WebElement logout=driver.findElement(By.linkText("Logout"));
	logout.click();
	

	}

}