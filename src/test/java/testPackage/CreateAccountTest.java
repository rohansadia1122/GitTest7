package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateAccountTest {
	
	@Test
	public void accountCreate() {
	
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.facebook.com/");
	dr.manage().window().maximize();
	
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	
	
	
}
}