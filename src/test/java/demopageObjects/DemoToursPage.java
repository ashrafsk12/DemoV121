package demopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoToursPage extends DemoBasePage {

	public DemoToursPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='REGISTER']")
	WebElement register;
	
	@FindBy(xpath="//a[normalize-space()='SIGN-ON']")
	WebElement btn_signin;
	
	public void clickonRegister()
	{
		register.click();
	}
	
	public void clickonSign_in()
	{
		btn_signin.click();
	}
	

}
