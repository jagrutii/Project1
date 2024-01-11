package com.creation.Project1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Testing");
		Thread.sleep(2000);
		
		List<WebElement> lst =  driver.findElements(By.xpath("//span[contains(text(),'testing')]"));
		int count = lst.size();
		System.out.println(count);
		//System.out.println("Page Source: " + driver.getPageSource());
		System.out.println("Are elements visible? " + lst.isEmpty());

		
		for(int i =0 ; i< lst.size(); i++) 
		{
		WebElement  item =  lst.get(i);
		String print =  item.getText();
		System.out.println(print);	
		}
		lst.get(count-1).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
