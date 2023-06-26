package testCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseConfigurationFile.BaseConfiguration;
import registerUser.Verify;
import registerUser.FillDetails;
import registerUser.DeleteAccount;
import registerUser.SignupPage;

public class Test1 extends BaseConfiguration {
	public SignupPage homesignup;
	public FillDetails Filluserdetails;
	public Verify VerifyAccount;
	public DeleteAccount deleteaccverify;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		homesignup = new SignupPage(driver);
		Filluserdetails = new FillDetails(driver);
		VerifyAccount = new Verify(driver);
		deleteaccverify = new DeleteAccount(driver);
	}
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		homesignup.HomePagesignup();
		homesignup.VisiblesignupCheck();
		homesignup.EnterNameEmail();
		homesignup.Clickenter();
		
		// Class 2
		Filluserdetails.VisiblesignupCheck();
		Filluserdetails.filldetialsAccountuser();
		
		// Class 3
		VerifyAccount.AccountButtonVerify();
		
		// Class 4
		deleteaccverify.AccountButtonVerify();
	}



}

