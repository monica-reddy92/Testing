package com.OrangeHRM.OrangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
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
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();
driver.findElement(By.id("btnSave")).click();

WebElement male=driver.findElement(By.id("personal_optGender_1"));

male.click();
Thread.sleep(2000);
if(male.isSelected())
{
	System.out.println("Male Is active");
}
else
{
	
}

WebElement female=driver.findElement(By.id("personal_optGender_2"));

female.click();
Thread.sleep(2000);
if(female.isSelected())
{
	System.out.println("Female Is active");
}
else
{
	
}

	}

}
