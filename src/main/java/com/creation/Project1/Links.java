package com.creation.Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		
		for (WebElement abc : ele) {
			System.out.println(abc.getAttribute("href"));
		}

	}

}
