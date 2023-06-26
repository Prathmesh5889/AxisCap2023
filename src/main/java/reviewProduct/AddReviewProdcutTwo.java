package reviewProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddReviewProdcutTwo {
	WebDriver driver;

	  public AddReviewProdcutTwo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	  
	  @FindBy(xpath="//*[text()='Write Your Review']")
	  public WebElement ReviewMsg;
	  
	  @FindBy(id="name")
	  public WebElement NameReview;
	  
	  @FindBy(id="email")
	  public WebElement EmailReview;
	  
	  @FindBy(id="review")
	  public WebElement WriteReview;
	  
	  @FindBy(id="button-review")
	  public WebElement SubmitReview;
	  
	  @FindBy(xpath = "//span[contains(text(),'Thank you for your review.')]")
	  public WebElement thanky;
	  
	  public void EnterReview()
	  {
		  ReviewMsg.isDisplayed();
		  NameReview.sendKeys("Prathmesh");
		  EmailReview.sendKeys("prathmeshdemo@gmail.com");
		  WriteReview.sendKeys("Great");
		  SubmitReview.click();
	  }
	  public void Thankyou()
	  {
		  System.out.println("Thanky YOu Review is displayed "+thanky.isDisplayed());
		  
		  Assert.assertEquals(thanky.isDisplayed(), true);
		  
	  }
	

}
