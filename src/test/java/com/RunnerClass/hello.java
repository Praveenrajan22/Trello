package com.RunnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class hello {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\gkish\\eclipse-workspace\\Sample_Project\\edgedriver\\msedgedriver.exe");
		driver=new EdgeDriver();
	
		driver.get("https://demo.automationtesting.in/Frames.html");
		
	driver.manage().window().maximize();
	
//	driver.switchTo().frame(0);
//	
//	WebElement Frame = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//	Frame.sendKeys("Praveen.S");
//	
	
WebElement frame2 = driver.findElement(By.xpath("//a[text()= 'Iframe with in an Iframe']"));
frame2.click();
driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])")));
		
WebElement sendkeys = driver.findElement(By.xpath("//input[@type='text']"));
sendkeys.sendKeys("Vikram");
		
		
		
		
		
		
	}
	
	
	//input[@type='text']
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
