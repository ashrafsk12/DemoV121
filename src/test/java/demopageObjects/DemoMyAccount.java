package demopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoMyAccount extends DemoBasePage {

	public DemoMyAccount(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//h3[normalize-space()='Login Successfully']")
	WebElement succesful_login;
	
	@FindBy(xpath="//a[normalize-space()='SIGN-OFF']")
	WebElement btn_signoff;
	
	public boolean isMyAccountExist()
	{
		try {
		boolean msgwindow=succesful_login.isDisplayed();
		return msgwindow;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void Signoff()
	{
		btn_signoff.click();
	}
}
