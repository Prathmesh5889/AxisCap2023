package testCases;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseConfigurationFile.BaseConfiguration;
import removeProductCart.AddToCartTwo;
import removeProductCart.RemoveToCartOne;

public class Test4 extends BaseConfiguration {
    public AddToCartTwo ac;
    public RemoveToCartOne RTC;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		ac = new AddToCartTwo(driver);
		RTC = new RemoveToCartOne(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		
		// class1
		ac.addToCart();
		
		// class2
		RTC.removeproduct();

	}



}


