package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tesngbasics {
		//pre conditions
	@BeforeSuite //1
	public void setup() {
		System.out.println("setup system property for chrome");
	}
	
	
	@BeforeClass //3
	public void launchbrowser() {
		System.out.println("launch browser");
	}
	
	@BeforeMethod  //4
	public void enterurl() {
		System.out.println("enter url");
	}
	
	@BeforeTest //2
	public void login() {
		System.out.println("login method");
	}
	    //test cases
		@Test //5
		public void googletitle() {
			System.out.println("google title test");
		}
	
		//post  conditions
		
	@AfterMethod //6
	public void logout() {
		System.out.println("logout from app");
	}
	
	
	@AfterTest  //8
	public void deleteallcookies() {
		System.out.println("Delete all cookies");
	}
	
	@AfterClass //7
	public void closebrowser() {
		System.out.println("close browser");
	}
	
	@AfterSuite
	public void generatetestreport() {
		System.out.println("generate report");
	}
	

}
