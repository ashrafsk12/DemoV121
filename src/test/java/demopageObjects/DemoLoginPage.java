package demopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoLoginPage extends DemoBasePage{

	public DemoLoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement txt_UserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_Password;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement btn_Submit;
	
	public void enterUserName(String username)
	{
		txt_UserName.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txt_Password.sendKeys(password);
	}
	
	public void clickOnSubmit()
	{
		btn_Submit.click();
	}

}
