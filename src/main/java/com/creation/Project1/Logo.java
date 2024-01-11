package com.creation.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logo {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		
		driver.findElement(By.id("username")).sendKeys("vengat16");
		driver.findElement(By.id("password")).sendKeys("Karthick");
		driver.findElement(By.id("login")).click();
		
		String s = driver.getCurrentUrl();
		
		System.out.println(s);
		
		if(s.equals("http://www.adactin.com/HotelApp/index.php")) {
			System.out.println("test passed");
		}
		else {
			System.out.println("Failed");
		}

	}
}

