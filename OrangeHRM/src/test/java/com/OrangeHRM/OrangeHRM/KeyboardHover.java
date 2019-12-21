package com.OrangeHRM.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Java\\Selenium_Java_Project\\driverFiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MINUTES);
	driver.get("http://127.0.0.1/orangehrm-4.3.4/symfony/web/index.php/auth/login");
	Actions act=new Actions(driver);
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("Smaran3005@").perform();;
	act.sendKeys(Keys.ENTER).perform();
	act.sendKeys(Keys.TAB).perform();




	}

}
