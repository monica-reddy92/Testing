package com.OrangeHRM.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Selenium {

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
driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
String actual_title=driver.getTitle();
String actual_url=driver.getCurrentUrl();
Thread.sleep(2000);
String attr_val=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr/td[2]/a")).getAttribute("href");
System.out.println(actual_title);
System.out.println(actual_url);
System.out.println(attr_val);

	}

}
