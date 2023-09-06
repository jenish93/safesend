package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	public static void main(String[] args) throws InterruptedException {
		  // setup
		WebDriverManager.chromedriver().setup();
		// open the Chrome
		WebDriver driver = new ChromeDriver();
		// launch the url
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='JQuery UI Menus']")).click();
		WebElement element = driver.findElement(By.xpath("//a[text()='Enabled']"));
		// obj creation for Action Class
		Actions mouseActions = new Actions(driver);
		Thread.sleep(2000);
		mouseActions.moveToElement(element).build().perform();
		Thread.sleep(2000);
		WebElement download = driver.findElement(By.xpath("//a[text()='Downloads']"));
		mouseActions.moveToElement(download).build().perform();
		Thread.sleep(2000);
		WebElement excel = driver.findElement(By.xpath("//a[text()='Excel']"));
		mouseActions.moveToElement(excel).build().perform();
		mouseActions.click().build().perform();
		Thread.sleep(2000);
		WebElement elSelenium = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
	    element.click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
		driver.get("https://elementalselenium.com/");
		
	}
			
			
		    
		   
		  
	
}
