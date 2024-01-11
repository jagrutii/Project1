package com.creation.Project1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//go to the webpage
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		//scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		//click on a link
		driver.findElement(By.xpath("//*[@id='commonWebElements']/p[1]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		//send text on textbox
		driver.findElement(By.id("fname")).sendKeys("Success");	
		driver.findElement(By.id("idOfButton")).click();
		
		//double click ACTION CLASS
		WebElement ele = driver.findElement(By.id("dblClkBtn"));
		Actions act = new Actions(driver);
		act.doubleClick(ele).build().perform();
		
		//Go to alert button
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//Checkbox
		driver.findElement(By.xpath("//*[@id='female']")).click();
		List<WebElement> element = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println(element.size());
		
		for (WebElement abc : element) {
			if (!abc.isSelected()) 
				abc.click();	
		}
		
		js.executeScript("window.scrollBy(0,250)", "");
		
		
		//Dropdown by SELECT CLASS
		WebElement dropdown = driver.findElement(By.id("testingDropdown"));
		
		Select drop = new Select(dropdown);
		System.out.println(drop.isMultiple());
		drop.selectByIndex(2);
		System.out.println(drop.getFirstSelectedOption().getText());
		
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#AlertBox > button")).click();
		
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.xpath("//*[@id='ConfirmBox']/button")).click();
		System.out.println(alert.getText());
		alert.dismiss(); // cancel alert
		System.out.println(driver.findElement(By.xpath("//*[@id='demo']")).getText());
		
		
		//drag and drop
		WebElement source =  driver.findElement(By.xpath("//*[@alt='art of testing']"));
		WebElement target =  driver.findElement(By.id("targetDiv"));
		
		act.dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);
		driver.close();
		}
		
	}

