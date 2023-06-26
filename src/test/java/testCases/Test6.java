package testCases;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseConfigurationFile.BaseConfiguration;
import reviewProduct.AddReviewProdcutTwo;
import reviewProduct.AddReviewProductOne;

public class Test6 extends BaseConfiguration {
	public AddReviewProductOne ARP;
	public AddReviewProdcutTwo ARP2;
	
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		ARP=new AddReviewProductOne(driver);
		ARP2=new AddReviewProdcutTwo(driver);
	}

	
	@Test
	public void DemoScenario() 
	{
		ARP.PerformReview();
		ARP2.EnterReview();
	}

	
	

}