package testCases;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseConfigurationFile.BaseConfiguration;
import loginIncorrectUser.loginuseragain;

public class Test3 extends BaseConfiguration {
	public loginuseragain homelogin1;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		homelogin1 = new loginuseragain(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		homelogin1.HomePagesignup2();
		homelogin1.VisiblesignupCheck2();
		homelogin1.enteremailandpassword2();
		homelogin1.loginclick2();
	}



}

