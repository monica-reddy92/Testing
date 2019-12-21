package com.OrangeHRM.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Checkboxes {

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
WebElement Admin_field=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
Actions act=new Actions(driver);
act.moveToElement(Admin_field).perform();
WebElement user_mgt=driver.findElement(By.id("menu_admin_UserManagement"));
act.moveToElement(user_mgt).perform();
Thread.sleep(2000);
WebElement users=driver.findElement(By.id("menu_admin_viewSystemUsers"));
users.click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr/td[2]/a")).click();
driver.findElement(By.className("addbutton")).click();
WebElement chckbox=driver.findElement(By.className("chkChangePassword"));
//chckbox.click();
if(chckbox.isSelected())
{
	System.out.println("Element is selected");
}
else
{
	System.out.println("Element is not selected");
}
}


	}


