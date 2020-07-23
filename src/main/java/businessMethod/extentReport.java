package businessMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class extentReport {

	ExtentReports extent;
	 ExtentTest logger;
	 WebDriver driver;
	
       // This code will run before executing any testcase
	@BeforeMethod
	public void setup()
	{
		
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		
	    extent = new ExtentReports();
	    
	    extent.attachReporter(reporter);
	    
	    logger=extent.createTest("LoginTest");
	}

	 
       // Actual Test which will start the application and verify the title
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		
		SingupFunction singupFunction = new SingupFunction();
		singupFunction.singup(driver);
		
	}
	
       // This will run after testcase and it will capture screenshot and add in report
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
		//	String temp=Utility.getScreenshot(driver);
			
			logger.fail(result.getThrowable().getMessage());
		
		extent.flush();
		driver.quit();
		
	}
	
	
}
}