package testCases;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseConfigurationFile.BaseConfiguration;
import loginCorrectuser.DeleteAccount2;
import loginCorrectuser.loginuser;

public class Test2 extends BaseConfiguration {
	public loginuser homelogin1;
	public DeleteAccount2 deleteccount;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		homelogin1 = new loginuser(driver);
		deleteccount = new DeleteAccount2(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		homelogin1.HomePagesignup1();
		homelogin1.VisiblesignupCheck();
		homelogin1.enteremailandpassword();
		homelogin1.loginclick();
		
		// class 2
		deleteccount.AccountButtonVerify();
	}



}

