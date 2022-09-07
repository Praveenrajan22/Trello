package com.Sample.project.Sample_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkish\\eclipse-workspace\\Sample_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://burrow.com/login");
		
		driver.manage().window().maximize();
		
		WebElement Bedroom = driver.findElement(By.xpath("(//span[@class='navigation-position__header'])[3]"));
		Bedroom.click();
		
		WebElement Nightlam = driver.findElement(By.xpath("(//a[text()='Benches'])[2]"));
		Nightlam.click();
		 
		
		WebElement close = driver.findElement(By.xpath("a[@id='bx-close-inside-1839250']"));
		driver.switchTo().parentFrame();
		close.click();

	}

}
