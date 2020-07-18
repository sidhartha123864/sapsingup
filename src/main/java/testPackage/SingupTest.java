package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import businessMethod.SingupFunction;

public class SingupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		SingupFunction singupFunction = new SingupFunction();
		singupFunction.singup(driver);
		
	
		
		
		
	}
		
		
	}


