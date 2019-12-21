package com.OrangeHRM.OrangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {

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
driver.findElement(By.id("personal_txtLicExpDate")).click();

WebElement month=driver.findElement(By.className("ui-datepicker-month"));
Select sel=new Select(month);
sel.selectByValue("Feb");

WebElement year=driver.findElement(By.className("ui-datepicker-year"));
Select sel1=new Select(year);
sel1.selectByValue("2009");

driver.findElement(By.linkText("4")).click();
	}

}
