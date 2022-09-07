package com.Sample.project.Sample_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver;
		 
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.get("https://trello.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"user\"]")).sendKeys("praveenrajan455@gmail.com");
		
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Praveen@2200");
		
		
		driver.findElement(By.id("login-submit")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//p[text()='Create']")).click();
		
		driver.findElement(By.xpath("(//button[@class='R2Zt2qKgQJtkYY'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']")).sendKeys("RADISON");
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		driver.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys("LIST A");
		
		driver.findElement(By.xpath("//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']")).click();
		
		driver.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys("LIST B");
		
		driver.findElement(By.xpath("//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']")).click();
		
		driver.findElement(By.xpath("(//a[@class='open-card-composer js-open-card-composer'])[1]")).click();
		
		driver.findElement(By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']")).sendKeys("Hi Full Creative");
		
		driver.findElement(By.xpath("//input[@class='nch-button nch-button--primary confirm mod-compact js-add-card']")).click();
		

		
		WebElement source = driver.findElement(By.xpath("//div[@class='list-card-details js-card-details']"));
		
		WebElement destination = driver.findElement(By.xpath("//h2[text()='LIST B']//parent::div[@class='list-header js-list-header u-clearfix is-menu-shown']//following-sibling::div[@class='card-composer-container js-card-composer-container']/a"));


		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(source, destination).build().perform();
		
		Point point = destination.getLocation();
		
		System.out.println(point.getX());
		
		System.out.println(point.getY());

		driver.findElement(By.xpath("//button[@title='Praveen Rajan (praveenrajan3)']")).click();
		
		driver.findElement(By.xpath("//span[text()='Log out']")).click();
	}
}

