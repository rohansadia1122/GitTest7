package testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginClass {
	WebDriver dr;

	@Test
	public void login() throws InterruptedException {
		dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();

		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		dr.findElement(By.id("email")).sendKeys("habib@gmail.com");
		dr.findElement(By.id("pass")).sendKeys("kkkkkkkkk");
		System.out.println("Success made by Habib");
		dr.close();

	}

	

	@Test
	public void method1() {
		System.out.println("My first method");

	}

	@Test
	public void method2() {
		System.out.println("My 2 method");

	}

	@Test
	public void method3() {
		System.out.println("My 3 method");
		Assert.assertTrue(false);

	}
	
	

}
