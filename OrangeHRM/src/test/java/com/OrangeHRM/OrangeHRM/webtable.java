package com.OrangeHRM.OrangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Java\\Selenium_Java_Project\\driverFiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MINUTES);
	driver.navigate().to("https://www.timeanddate.com/worldclock/");
	WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/thead/tr/th"));
List<WebElement> rows=table.findElements(By.tagName("tr"));
for(int i=0;i<rows.size();i++)
{
	List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
	Thread.sleep(2000);
	for(int j=0;j<cols.size();j++)
	{
		Thread.sleep(2000);
		String value=cols.get(j).getText();
		System.out.print("Hi");
	
		System.out.print(value+" ");
	}
	System.out.println();
}
	driver.quit();
	}
}
