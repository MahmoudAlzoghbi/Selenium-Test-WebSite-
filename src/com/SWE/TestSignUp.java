package com.SWE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSignUp {

	public WebDriver driver;
	public InvokeBrowser invoke = new InvokeBrowser();

	/// Student Form Testing
	public void TestSignUpForStudent() {
		driver = invoke.InvokeChrome(driver);

		driver.get("http://localhost/library-master/student_form.php");
		// First Name
		driver.findElement(By.xpath("//*[@id=\"FristName\"]")).sendKeys("Mahmoud");
		// Last Name
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("ALzoghbi");
		// UserName
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("MahmoudAlzohgbi");
		// Gender
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[4]/div/select")).sendKeys("Male");
		// Address
		driver.findElement(By.xpath("//*[@id=\"Address\"]")).sendKeys("Cairo");
		// Roll Number
		driver.findElement(By.xpath("//*[@id=\"RollNumber\"]")).sendKeys("20");
		// contact
		driver.findElement(By.xpath("//*[@id=\"Contact\"]")).sendKeys("0100101101101");
		// Type
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[8]/div/select"))
				.sendKeys("Student");
		// Year Level
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[9]/div/select"))
				.sendKeys("First Year");
		// Password
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[10]/div/input"))
				.sendKeys("123asdzxc");
		// Confirm
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[11]/div/button")).click();
	}

	public void TestFristNameFieldForStudent() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/student_form.php");
		driver.findElement(By.xpath("//*[@id=\"FristName\"]")).sendKeys("Mahmoud");
	}

	public void TestLastNameFieldForStudent() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/student_form.php");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("ALzoghbi");
	}

	public void TestUsernameFieldForStudent() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/student_form.php");
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("MahmoudAlzohgbi");
	}

	public void TestGenderFieldForStudent() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/student_form.php");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[4]/div/select")).sendKeys("Male");

	}

	public void TestAddressFieldForStudent() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/student_form.php");
		driver.findElement(By.xpath("//*[@id=\"Address\"]")).sendKeys("Cairo");
	}

	public void TestRollNumberFieldForStudent() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/student_form.php");
		driver.findElement(By.xpath("//*[@id=\"RollNumber\"]")).sendKeys("20");
	}

	public void TestContactFieldForStudent() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/student_form.php");
		driver.findElement(By.xpath("//*[@id=\"Contact\"]")).sendKeys("0100101101101");
	}

	public void TestTypeFieldForStudent() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/student_form.php");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[8]/div/select"))
				.sendKeys("Student");
	}

	public void TestYearLevelFieldForStudent() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/student_form.php");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[9]/div/select"))
				.sendKeys("First Year");
	}

	public void TestPasswordFieldForStudent() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/student_form.php");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[10]/div/input"))
				.sendKeys("123asdzxc");
	}

	public void TestConfirmButtonForStudent() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/student_form.php");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[11]/div/button")).click();
	}

	////// Teacher Form Testing

	public void TestSignUpForTeacher() {
		driver = invoke.InvokeChrome(driver);

		driver.get("http://localhost/library-master/teacher_form.php");
		// First Name
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Ahmed");
		// Last Name
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Mohammed");
		// User Name
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("Ahmed.Mohammed");
		// Gender
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[4]/div/select"))
				.sendKeys("Male");
		// Address
		driver.findElement(By.xpath("//*[@id=\"Address\"]")).sendKeys("El Fayoum");
		// Contact
		driver.findElement(By.xpath("//*[@id=\"Contact\"]")).sendKeys("01100000000");
		// Type
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[7]/div/select"))
				.sendKeys("Teacher");
		// Password
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[8]/div/input"))
				.sendKeys("1237890");
		// Confirmation Button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[9]/div/button")).click();
	}

	public void TestFirstNameFieldForTeacher() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/teacher_form.php");
		// First Name
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Ahmed");
	}

	public void TestLastNameFieldForTeacher() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/teacher_form.php");
		// Last Name
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Mohammed");
	}

	public void TestUserNameFieldForTeacher() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/teacher_form.php");
		// User Name
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("Ahmed.Mohammed");
	}

	public void TestGenderFieldForTeacher() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/teacher_form.php");
		// Gender
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[4]/div/select"))
				.sendKeys("Male");
	}

	public void TestAddressFieldForTeacher() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/teacher_form.php");
		// Address
		driver.findElement(By.xpath("//*[@id=\"Address\"]")).sendKeys("El Fayoum");
	}

	public void TestContactFieldForTeacher() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/teacher_form.php");
		// Contact
		driver.findElement(By.xpath("//*[@id=\"Contact\"]")).sendKeys("01100000000");
	}

	public void TestTypeFieldForTeacher() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/teacher_form.php");
		// Type
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[7]/div/select"))
				.sendKeys("Teacher");
	}

	public void TestPasswordFieldForTeacher() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/teacher_form.php");
		// Password
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[8]/div/input"))
				.sendKeys("1237890");
	}

	public void TestConfirmButtonForTeacher() {
		driver = invoke.InvokeChrome(driver);
		driver.get("http://localhost/library-master/teacher_form.php");
		// Confirmation Button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[9]/div/button")).click();
	}

}
