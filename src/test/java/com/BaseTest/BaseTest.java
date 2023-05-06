package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	public WebDriver openChrome() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://inventory.qaelearn.com/login");
		return driver;
	}
	
	public WebDriver openEdge() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("http://inventory.qaelearn.com/login");
		return driver;
	}
	
	public WebDriver openFireFox() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://inventory.qaelearn.com/login");
		return driver;
	}
	
}
