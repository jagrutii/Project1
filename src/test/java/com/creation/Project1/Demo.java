package com.creation.Project1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		//maximizes window
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		
		Point p = new Point(250, 250);
		driver.manage().window().setPosition(p);;
		
	}
}
