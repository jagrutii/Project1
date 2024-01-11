package com.creation.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("vengatram");
		driver.findElement(By.name("password")).sendKeys("vengat@123445");
		
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		
	}

}
