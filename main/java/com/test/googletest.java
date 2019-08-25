package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class googletest {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\sekar\\Testng\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		
	}
	
	@Test
	public void googletitletest() {
		String title= driver.getTitle();
		System.out.println(title);
	}
	 @Test
	 public void logotest(){
		boolean  b= driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
	 }
	@Test 
	public void maillink(){
		boolean b =driver.findElement(By.linkText("mail")).isDisplayed();
		Assert.assertTrue(b);
	}
	
/*	@AfterMethod
	public void teardown() {
		driver.close();
	} */
	
}
