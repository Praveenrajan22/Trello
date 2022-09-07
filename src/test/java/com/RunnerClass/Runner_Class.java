package com.RunnerClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\gkish\\eclipse-workspace\\Sample_Project\\src\\test\\java\\com\\RunnerClass\\Runner_Class.java", 
glue = "com.stepDefinition" )

public class Runner_Class {
	
	
	public static  WebDriver driver;
	
	@BeforeClass public static  void stepup() {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkish\\eclipse-workspace\\Sample_Project\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}		
 
	 @AfterClass 

	 public static  void teardown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
