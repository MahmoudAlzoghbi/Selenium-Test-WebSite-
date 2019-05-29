package com.SWE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSignIn {

	public WebDriver driver;
	public InvokeBrowser invoke = new InvokeBrowser();

	public WebDriver TestSignInFuction() {
		
		driver = invoke.InvokeChrome(driver);
		
		driver.get("http://localhost/library-master/index.php");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd26");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		return driver;
	}
	
	public void TestSignInPasswordField() {
		driver = invoke.InvokeChrome(driver);
		
		driver.get("http://localhost/library-master/member/index.php");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123123");
	}
	public void TestSignInUserNameField() {
		driver = invoke.InvokeChrome(driver);
		
		driver.get("http://localhost/library-master/member/index.php");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Mahmoud");
	}
	
	public void TestSignInConfirmButton() {
		driver = invoke.InvokeChrome(driver);
		
		driver.get("http://localhost/library-master/member/index.php");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	}
}
