package com.gmail.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class demo {

	public static void main(String[] args) throws Exception {
		
 System.setProperty("webdriver.chrome.driver","C:\\selenium software\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
 driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("lekhana");
 Thread.sleep(3000);
 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gowda");
 //driver.findElement(By.linkText("Sign in")).click();
 driver.findElement(By.partialLinkText("Want to register")).click();
 Thread.sleep(3000);
 driver.findElement(By.cssSelector("#company")).sendKeys("arcus");
 Thread.sleep(3000);
 driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("infotech");
 List<WebElement> list=driver.findElements(By.tagName("input"));

	System.out.println(list.size());
	driver.close();

 driver.close();
 
	}

}
