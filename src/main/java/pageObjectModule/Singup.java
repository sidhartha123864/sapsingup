package pageObjectModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Singup {
	
	@FindBy(how=How.XPATH,using="//*[text()='OK']")
	public WebElement Okbutton;
	@FindBy(how=How.XPATH,using="//div[@class='btn--content']")
	public WebElement Singupbutton;
	@FindBy(how=How.XPATH,using=" //*[@id='firstName']")
	public WebElement firstname;
	@FindBy(how=How.XPATH,using="//input[@id='lastName']")
	public WebElement lastname;
	@FindBy(how=How.XPATH,using="//input[@id='mail']")
	public WebElement email;
	@FindBy(how=How.XPATH,using="//input[@id='newPasswordInput']")
	public WebElement password;
	@FindBy(how=How.XPATH,using="//input[@id='passwordConfirm']")
	public WebElement repassword;
	@FindBy(how=How.XPATH,using="//input[@id='pdAccept']")
	public WebElement chekbox1;
	@FindBy(how=How.XPATH,using="//input[@id='checkbox']")
	public WebElement checkbox2;
	@FindBy(how=How.XPATH,using="//button[@id='sapStoreRegisterFormSubmit']")
	public WebElement Register;
	
	
	
	
	
	
}
