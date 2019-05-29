package com.SWE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	// 3lshan el browser yeshta3'al
	// w el Function De Bst5demha fe kl el classes

	public WebDriver InvokeChrome(WebDriver driver) {
		// 3lshan asta5dem el-driver lazem a download el executable
		System.setProperty("webdriver.chrome.driver",
				"D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
		// B3rf object mn el Browser ely 3ayez ashta3'l 3leh
		driver = new ChromeDriver();
		// Da by5aly el window tafta7 kamla
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		return driver;
	}
}
