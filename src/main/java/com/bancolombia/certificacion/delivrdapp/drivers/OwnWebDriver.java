package com.bancolombia.certificacion.delivrdapp.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OwnWebDriver {
	

private static WebDriver driver;
	
	public static WebDriver onUrl(String url) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		driver=new ChromeDriver();
		driver.get(url);
		return driver ;
	}
}
