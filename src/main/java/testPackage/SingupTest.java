package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import businessMethod.SingupFunction;

public class SingupTest {

@Test
public void singup() throws InterruptedException  {
//	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		SingupFunction singupFunction = new SingupFunction();
		singupFunction.singup(driver);
		
	
		
		
		
	}
		
		
	}


