package com.SWE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAdvancedSearch {

	public WebDriver driver;
	public TestSignIn test = new TestSignIn();

	// Without Button Close
	public void AdvancedSearch() {
		driver = test.TestSignInFuction();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("Computer");
		driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("Mahmoud");
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div[2]/form/div[3]/div/button")).click();
	}

	// Test Close Button
	public void TestCloseButtonInAdvancedSearch() {
		driver = test.TestSignInFuction(); 
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div[3]/button")).click();
	}
}
