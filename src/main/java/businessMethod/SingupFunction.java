package businessMethod;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pageObjectModule.Singup;

public class SingupFunction {
	Singup singup;
	public void singup(WebDriver driver) throws InterruptedException {	
		Singup singup = PageFactory.initElements(driver,Singup.class);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://cai.tools.sap/");
		driver.manage().window().maximize();
		excelSheet excel = new excelSheet();
		
		
		
		  singup.Okbutton.click();
	    singup.Singupbutton.click();
		Thread.sleep(5000);
		 WebElement e = driver.findElement(By.id("IDS_UI_Window"));
		 driver.switchTo().frame(e);
	//Tell us about yourself	
		singup.firstname.sendKeys(excel.firstname);
		singup.lastname.sendKeys(excel.lasttname);
		singup.email.sendKeys(excel.mail);
//	set password
		singup.password.sendKeys(excel.password);
		singup.repassword.sendKeys(excel.Repassword);
		singup.chekbox1.click();
		singup.checkbox2.click();
		singup.Register.click();

	}
}
