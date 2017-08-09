package com.first.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Common_property {
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void beforeMethod(String browser){
		if(browser.equalsIgnoreCase("Firefox")){
		driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver","C:\\usr\\development\\req_sw\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver","C:\\usr\\development\\req_sw\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		
		driver.get("https://login.yahoo.com/config/login_verify2?&.src=ym");
		
	}
	@Test
	public void browserTest(){
		System.out.println("test was successful");
	}
	
	//@AfterMethod
	public void afterMethod(){
		
		System.out.println("Runs after each test");
	}

}
