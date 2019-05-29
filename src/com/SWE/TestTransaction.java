package com.SWE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTransaction {

	public WebDriver driver;
	public TestSignIn test = new TestSignIn();

	public void TestTransactionForReturnedBooks() {

		// 3malt logIn
		driver = test.TestSignInFuction();
		// h3ml transaction 3lshan a3ml view ll Returned book
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/ul/li[1]/a")).click();
	}

	public void TestTransactionForBorrowedBooks() {

		// 3malt logIn
		driver = test.TestSignInFuction();
		// h3ml transaction 3lshan a3ml view ll Borrowed book
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/ul/li[2]/a")).click();
	}
}
