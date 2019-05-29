package com.SWE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAboutBook {

	public WebDriver driver;
	public TestSignIn test = new TestSignIn();
	
	public void SearchInAllBooks() {
		driver = test.TestSignInFuction();
		// kda hn3ml el search in All books
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("Arch");
	}

	public void SearchInOldBooks() {
		driver = test.TestSignInFuction();
		
		// kda hn3ml el search in Old books
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("Computer");
	}

	public void SearchInNewBooks() {
		driver = test.TestSignInFuction();
		
		// kda hn3ml el search in New books
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("Laravel");
	}
}
